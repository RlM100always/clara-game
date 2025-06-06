class Ghost extends Character {
    int moveSpeed;
    String direction;
    int animationTimer = 0;
    int animationDelay = 4;
    boolean isDead     = false;
    int deathTimer     = 0;
    static final int DEATH_DURATION = 180;
    static int ghostCount = 0;
    int myNumber;

    Ghost() {
        super();
        myNumber  = ghostCount++;
        moveSpeed = (myNumber % 3) + 1;
        direction = (myNumber % 2 == 0 ? "left" : "right");
        // only wrap when engine ready
        try {
            setDirection(direction);
            wrapAroundWorld();
        } catch (Exception ex) { }
    }

    void act() {
        // wait for engine wiring
        if (_board == null || _player == null) return;

        // 1) hit by bullet?
        if (intersectsWithName("Dot") && Dot.isBulletVisible && !isDead) {
            isDead     = true;
            deathTimer = 0;
        }

        // 2) dead‐state
        if (isDead) {
            deathTimer++;
            animateDead();
            if (deathTimer >= DEATH_DURATION) {
                isDead     = false;
                deathTimer = 0;
            }
            return;
        }

        // 3) catch Clara
        BoardTile clara = getClara();
        if (clara != null && intersects(clara)) {
            makeClaraDead();
        }

        // 4) walk & bounce
        if (direction == "left"  && earthToLeft()) {
            direction = "right"; setDirection(direction);
        }
        else if (direction == "right" && earthToRight()) {
            direction = "left";  setDirection(direction);
        }
        move(moveSpeed);

        // 5) fall
        if (!earthBelow()) {
            String saved = direction;
            setDirection("down");
            move(1);
            setDirection(saved);
        }

        // 6) animate
        animationTimer++;
        if (animationTimer >= animationDelay) {
            animate();
            animationTimer = 0;
        }
    }
}