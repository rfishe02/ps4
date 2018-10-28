/* Generated By:JavaCC: Do not edit this line. PS4TokenizerTokenManager.java */
import java.io.*;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/** Token Manager. */
public class PS4TokenizerTokenManager implements PS4TokenizerConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private int jjMoveStringLiteralDfa0_0()
{
   return jjMoveNfa_0(5, 0);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 67;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                     jjCheckNAddStates(0, 9);
                  }
                  else if ((0x8400f0c200000000L & l) != 0L)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAdd(6);
                  }
                  else if (curChar == 40)
                     jjstateSet[jjnewStateCnt++] = 18;
                  else if (curChar == 13)
                  {
                     if (kind > 3)
                        kind = 3;
                     jjCheckNAdd(4);
                  }
                  else if (curChar == 9)
                  {
                     if (kind > 2)
                        kind = 2;
                     jjCheckNAdd(3);
                  }
                  else if (curChar == 32)
                  {
                     if (kind > 1)
                        kind = 1;
                     jjCheckNAddTwoStates(0, 2);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  else if ((0xac0000000000L & l) != 0L)
                  {
                     if (kind > 4)
                        kind = 4;
                  }
                  else if ((0x8000400200000400L & l) != 0L)
                  {
                     if (kind > 14)
                        kind = 14;
                     jjCheckNAdd(33);
                  }
                  else if (curChar == 38)
                     jjAddStates(10, 11);
                  if (curChar == 46)
                     jjCheckNAdd(31);
                  else if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 0:
                  if (curChar != 32)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjCheckNAddTwoStates(0, 2);
                  break;
               case 3:
                  if (curChar != 9)
                     break;
                  kind = 2;
                  jjCheckNAdd(3);
                  break;
               case 4:
                  if (curChar != 13)
                     break;
                  kind = 3;
                  jjCheckNAdd(4);
                  break;
               case 6:
                  if ((0x8400f0c200000000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAdd(6);
                  break;
               case 7:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 9:
                  if (curChar == 59 && kind > 6)
                     kind = 6;
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 12:
                  if (curChar == 46)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(12, 13);
                  break;
               case 15:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 17:
                  if (curChar == 40)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(19);
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(12, 15);
                  break;
               case 21:
                  if (curChar == 41)
                     jjCheckNAddStates(16, 18);
                  break;
               case 22:
                  if (curChar == 32)
                     jjCheckNAddStates(19, 23);
                  break;
               case 25:
                  if ((0x600000000000L & l) != 0L)
                     jjCheckNAddStates(19, 23);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(19, 27);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 28:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 30:
                  if (curChar == 46)
                     jjCheckNAdd(31);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(24, 26);
                  break;
               case 32:
                  if (curChar != 44)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(30, 31);
                  break;
               case 33:
                  if ((0x8000400200000400L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAdd(33);
                  break;
               case 34:
                  if (curChar == 38)
                     jjAddStates(10, 11);
                  break;
               case 35:
                  if (curChar == 59 && kind > 4)
                     kind = 4;
                  break;
               case 38:
                  if (curChar == 35)
                     jjCheckNAdd(39);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(39, 9);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(0, 9);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(27, 32);
                  break;
               case 42:
                  if ((0xac0000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(33, 36);
                  break;
               case 43:
                  if (curChar == 61)
                     jjCheckNAddStates(37, 39);
                  break;
               case 44:
                  if (curChar == 32)
                     jjCheckNAddStates(37, 39);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddTwoStates(47, 48);
                  break;
               case 48:
                  if (curChar != 46)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAdd(47);
                  break;
               case 49:
                  if (curChar != 32)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(40, 45);
                  break;
               case 50:
                  if (curChar != 32)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(46, 48);
                  break;
               case 55:
                  if (curChar != 59)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(33, 36);
                  break;
               case 58:
                  if (curChar == 38)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 59:
                  if (curChar != 32)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(49, 58);
                  break;
               case 64:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 65;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                     jjCheckNAddStates(59, 61);
                  }
                  else if (curChar == 64)
                     jjCheckNAddTwoStates(15, 16);
                  else if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 1:
                  if (curChar != 115)
                     break;
                  if (kind > 1)
                     kind = 1;
                  jjAddStates(62, 63);
                  break;
               case 2:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjAddStates(64, 65);
                  break;
               case 10:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 11:
                  if (curChar == 64)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 13:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(12, 13);
                  break;
               case 14:
                  if (curChar == 64)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 16:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(15, 16);
                  break;
               case 23:
                  if (curChar == 115)
                     jjAddStates(19, 23);
                  break;
               case 24:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 36:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 45:
                  if (curChar == 115)
                     jjAddStates(37, 39);
                  break;
               case 46:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 51:
                  if (curChar != 115)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(46, 48);
                  break;
               case 52:
                  if (curChar == 92)
                     jjCheckNAdd(51);
                  break;
               case 53:
                  if (curChar == 92)
                     jjCheckNAddTwoStates(54, 51);
                  break;
               case 54:
                  if (curChar != 115)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(33, 36);
                  break;
               case 56:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 103)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 60:
                  if (curChar == 92)
                     jjCheckNAddStates(66, 68);
                  break;
               case 61:
                  if (curChar != 115)
                     break;
                  if (kind > 10)
                     kind = 10;
                  jjCheckNAddStates(27, 32);
                  break;
               case 62:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAddStates(59, 61);
                  break;
               case 63:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(63, 64);
                  break;
               case 65:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjstateSet[jjnewStateCnt++] = 65;
                  break;
               case 66:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(66);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 67 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   19, 41, 42, 58, 43, 30, 31, 32, 59, 60, 37, 38, 21, 22, 24, 25, 
   22, 24, 25, 17, 22, 24, 25, 26, 30, 31, 32, 41, 42, 58, 43, 59, 
   60, 41, 43, 49, 53, 44, 46, 47, 41, 50, 52, 43, 49, 53, 50, 52, 
   43, 41, 42, 58, 50, 52, 43, 49, 53, 59, 60, 63, 64, 66, 0, 2, 
   8, 9, 61, 54, 51, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xf001L, 
};
static final long[] jjtoSkip = {
   0xffeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[67];
private final int[] jjstateSet = new int[134];
protected char curChar;
/** Constructor. */
public PS4TokenizerTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public PS4TokenizerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 67; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 15)
   {
      jjmatchedKind = 15;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
