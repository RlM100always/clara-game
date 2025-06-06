class MyClara extends Clara {
    

    public final char[][] LEVEL_1 = {
    {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','.',' ',' ','%',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ',' ',' ',' ',' ',' ',' ',' ',' ','~','~','~',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','~','~','~',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ',' ',' ',' ',' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ','.',' ',' ',' ',' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ',' ',' ',' ',' ','~','~','~',' ',' ',' ',' ','~','~','~','~','~',' ',' ',' ','~','~','~',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','%',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
    {' ','~','~','~',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','~','~',' ',' ',' ',' ','~','~','~',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','$',' ',' '},
    {'@','-',' ',' ',' ',' ',' ',' ','%',' ',' ',' ',' ',' ',' ',' ',' ',' ','%',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','%',' ',' ',' ',' ',' ','~','~','~','~'},
    {'~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~'}
};

    final char[][] LEVEL_2 = {
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ','.',' ','~','~',' ',' ',' ',' ',' ',' ',' ',' ','~','~','~',' ',' ','~','~',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','~',' ',' ',' ',' '},
        {'~','@','-','~','~',' ','%','.',' ',' ',' ','%',' ','~','~','~','.','.','~','~','%','%',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','~',' ','$',' ','~'},
        {'~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~'}
    };

    final char[][] LEVEL_3 = {
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ',' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ','.',' ',' ',' ','.',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        {' ','.',' ','~','~',' ',' ',' ',' ','.',' ',' ',' ','~','~','~',' ',' ','~','~',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','~',' ',' ',' ',' '},
        {'~','@','-','~','~',' ','%','.',' ',' ',' ','%',' ','~','~','~','.','.','~','~','%','%',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','~',' ','$',' ','~'},
        {'~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~','~'}
    };

    static String claraDirection = "right";
    int animationTimer = 0;
    int bulletReloadTimer = 0;
    int jumpTimer = 0;
    int jumpDir = 0;    
    int jumpPhase = 0;  
    int moveSpeed = 1;  
    
    static final int RELOAD_DELAY = 300;
    static final int JUMP_DURATION = 4;
    static final int RISE_DURATION = 4;
    
    boolean introPlayed = false;
    boolean isDead = false;

    private boolean isOnGround() {
        return onEarth() || earthBelow();
    }

    private boolean canMove(String direction) {
        if (!onEarth() && !earthBelow()) return false;
        
        setDirection(direction);
        boolean canMove = !earthFront() && !mushroomFront();
        setDirection(claraDirection);
        
        return canMove;
    }

    private void handleWalking() {
        if (jumpTimer > 0) return;
        
        if (Keyboard.isKeyDown("left")) {
            moveInDirection("left");
        }
        else if (Keyboard.isKeyDown("right")) {
            moveInDirection("right");
        }
    }

    private void moveInDirection(String direction) {
        claraDirection = direction;
        if (canMove(direction)) {
            setDirection(direction);
            for (int i = 0; i < moveSpeed; i++) {
                if (!earthFront() && !mushroomFront()) {
                    move();
                }
            }
        }
    }

    private void handleMovement() {
        if (!isOnGround() && jumpTimer == 0) {
            handleFalling();
            return;
        }

        if (jumpTimer > 0) {
            performJumpMovement();
            jumpTimer--;
        }
        else if (Keyboard.isKeyDown("up") && isOnGround()) {
            startJump();
        }
        else {
            handleWalking();
        }
    }

    void act() {
        if (_board==null || _player==null) return;

        handleIntroMusic();
        if (handleDeath()) return;
        handleMovement();
        handleActions();
        handleAnimation();
    }

    private void handleIntroMusic() {
        if (!introPlayed) {
            playIntro();
            introPlayed = true;
            wrapAroundWorld();
        }
        if (!isIntroStillPlaying()) {
            playIntro();
        }
    }

    private boolean handleDeath() {
        if (isClaraDead()) {
            animateDead();
            restartGame();
            return true;
        }
        return false;
    }

    private void performJumpMovement() {
        boolean canMoveUp = !earthAbove();
        boolean canMoveSide = (jumpDir < 0) ? !earthToLeft() : !earthToRight();

        if (jumpTimer > JUMP_DURATION/2) {
            if (canMoveUp && canMoveSide) {
                moveUpDiagonally();
            }
            else if (canMoveUp) {
                setDirection("up");
                move();
            }
            else {
                jumpTimer = JUMP_DURATION/2;
            }
        }
        else {
            if (!onEarth() && !earthBelow() && canMoveSide) {
                moveDownDiagonally();
            }
            else if (!onEarth() && !earthBelow()) {
                setDirection("down");
                move();
            }
            else {
                jumpTimer = 0;
            }
        }
    }

    private void moveUpDiagonally() {
        setDirection("up");
        move();
        setDirection(jumpDir < 0 ? "left" : "right");
        move();
        claraDirection = (jumpDir < 0 ? "left" : "right");
    }

    private void moveDownDiagonally() {
        setDirection("down");
        move();
        setDirection(jumpDir < 0 ? "left" : "right");
        move();
        claraDirection = (jumpDir < 0 ? "left" : "right");
    }

    private void startJump() {
        if (!isOnGround()) return;
        
        jumpTimer = JUMP_DURATION;
        playJumpSound();
        
        if (Keyboard.isKeyDown("left")) {
            jumpDir = -1;
            claraDirection = "left";
        }
        else if (Keyboard.isKeyDown("right")) {
            jumpDir = 1;
            claraDirection = "right";
        }
        else {
            jumpDir = (claraDirection == "left") ? -1 : 1;
        }
    }

    private void handleFalling() {
        setDirection("down");
        move();
    }

    private void handleActions() {
        if (Keyboard.isKeyDown("s") && bulletReloadTimer == 0) {
            bulletReloadTimer = RELOAD_DELAY;
            Dot.fireBullet = true;
        }

        if (onLeaf()) {
            removeLeaf();
            playCollectLeafSound();
        }

        if (allLeavesEaten() && mushroomFront()) {
            advanceToNextLevel();
            bulletReloadTimer = 0;
        }

        if (bulletReloadTimer > 0) {
            bulletReloadTimer--;
        }
    }

    private void handleAnimation() {
        animationTimer++;
        if (animationTimer >= 3) {
            animate();
            animationTimer = 0;
        }
    }

    void restartGame() {
        advanceToLevel(LEVEL_1);
        claraDirection = "right";
        animationTimer = 0;
        bulletReloadTimer = 0;
        jumpTimer = 0;
        jumpDir = 0;
        jumpPhase = 0;
        introPlayed = false;
        isDead = false;
    }

    void advanceToNextLevel() {
        int lvl = getCurrentLevelNumber();
        if (lvl == 1) {
            advanceToLevel(LEVEL_2);
        }
        else if (lvl == 2) {
            advanceToLevel(LEVEL_3);
        }
        else {
            advanceToLevel(LEVEL_1);
        }
    }
}