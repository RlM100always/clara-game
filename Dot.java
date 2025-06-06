class Dot extends Character {
    static boolean fireBullet      = false;
    static boolean isBulletVisible = false;   // ← re‐introduced

    int    moveSpeed    = 5;
    boolean isActive    = false;
    int     lifeTimer   = 0;
    static final int BULLET_LIFETIME = 300;

    Dot() {
        super();
        try {
            wrapAroundWorld();
            animateInvisible();
            isBulletVisible = false;    // start hidden
        } catch (Exception ex) { }
    }

    void act() {
        if (_board==null || _player==null) return;

        // 1) fire
        if (fireBullet && !isActive) {
            startBullet();
            fireBullet = false;
        }
        // 2) update
        if (isActive) {
            updateBullet();
        }
    }

    void startBullet() {
        BoardTile clara = getClara();
        if (clara == null) return;
        moveToClara();
        setDirection(MyClara.claraDirection);

        animate();                  // show sprite
        isBulletVisible = true;     // signal it’s now visible
        isActive        = true;
        lifeTimer       = 0;
        playShotSound();
    }

    void updateBullet() {
        move(moveSpeed);
        lifeTimer++;
        if (lifeTimer >= BULLET_LIFETIME || onEarth()) {
            animateInvisible();     // hide it again
            isBulletVisible = false;
            isActive        = false;
        }
    }
}