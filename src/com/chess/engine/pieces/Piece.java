package com.chess.engine.pieces;

public class Piece {
    protected final int piecePosition;
    protected final Alliance pieceAlliance;

    Piece(final int  piecePosition, final Alliance pieceAlliance){
        this.pieceAlliance = pieceAlliance;
        this.piecePosition = piecePosition;
    }


}
