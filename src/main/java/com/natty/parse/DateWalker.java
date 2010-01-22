// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g 2010-01-21 13:57:17
 package com.natty.parse; 

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DateWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATE_TIME", "RELATIVE_DATE", "EXPLICIT_DATE", "AM_PM", "ERA", "EXPLICIT_TIME", "DIRECTION", "MONTH", "DAY", "YEAR", "DAY_OF_WEEK", "INTEGER", "FOUR_DIGITS", "DATE_FRAME", "YEAR_DATE_FRAME", "ONE_TO_TWELVE", "THIRTEEN_TO_TWENTY_FOUR", "TWENTY_FIVE_TO_THIRTY_ONE", "TWO_ZEROS", "THIRTY_TWO_TO_FIFTY_NINE", "SIXTY_TO_NINETY_NINE", "THREE_DIGITS", "DIGIT", "WHITE_SPACE", "'on'", "'at'", "','", "'of'", "'this'", "'in'", "'days'", "'from now'", "'ago'", "':'", "'am'", "'a'", "'pm'", "'p'", "'-'", "'/'", "'last'", "'next'", "'first'", "'1st'", "'second'", "'2nd'", "'third'", "'3rd'", "'fourth'", "'4th'", "'fifth'", "'5th'", "'sixth'", "'6th'", "'seventh'", "'7th'", "'eighth'", "'8th'", "'ninth'", "'9th'", "'tenth'", "'10th'", "'eleventh'", "'11th'", "'twelfth'", "'12th'", "'thirteenth'", "'13th'", "'fourteenth'", "'14th'", "'fifteenth'", "'15th'", "'sixteenth'", "'16th'", "'seventeenth'", "'17th'", "'eighteenth'", "'18th'", "'nineteenth'", "'19th'", "'twentieth'", "'20th'", "'twenty'", "'21st'", "'22nd'", "'23rd'", "'24th'", "'25th'", "'26th'", "'27th'", "'28th'", "'29th'", "'thirtieth'", "'30th'", "'thirty'", "'31st'", "'january'", "'jan'", "'february'", "'feb'", "'march'", "'mar'", "'april'", "'apr'", "'may'", "'june'", "'jun'", "'july'", "'jul'", "'august'", "'aug'", "'september'", "'sep'", "'october'", "'oct'", "'november'", "'nov'", "'december'", "'dec'", "'monday'", "'mon'", "'tuesday'", "'tue'", "'tues'", "'wednesday'", "'wed'", "'thursday'", "'thur'", "'thurs'", "'friday'", "'fri'", "'saturday'", "'sat'", "'sunday'", "'sun'", "'today'", "'yesterday'", "'the'", "'day after '", "'day before yesterday'", "'tomorow'", "'tomorrow'", "'tommorow'", "'tommorrow'", "'midnight'", "'noon'", "'''", "'ad'", "'bc'"
    };
    public static final int DIRECTION=10;
    public static final int YEAR_DATE_FRAME=18;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int DAY=12;
    public static final int EOF=-1;
    public static final int MONTH=11;
    public static final int DATE_TIME=4;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int AM_PM=7;
    public static final int T__92=92;
    public static final int SIXTY_TO_NINETY_NINE=24;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int RELATIVE_DATE=5;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int DAY_OF_WEEK=14;
    public static final int EXPLICIT_DATE=6;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int EXPLICIT_TIME=9;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int THIRTY_TWO_TO_FIFTY_NINE=23;
    public static final int TWENTY_FIVE_TO_THIRTY_ONE=21;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int FOUR_DIGITS=16;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int YEAR=13;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int THREE_DIGITS=25;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int WHITE_SPACE=27;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int TWO_ZEROS=22;
    public static final int DIGIT=26;
    public static final int T__50=50;
    public static final int DATE_FRAME=17;
    public static final int T__42=42;
    public static final int INTEGER=15;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int THIRTEEN_TO_TWENTY_FOUR=20;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int ERA=8;
    public static final int ONE_TO_TWELVE=19;

    // delegates
    // delegators


        public DateWalker(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public DateWalker(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DateWalker.tokenNames; }
    public String getGrammarFileName() { return "/Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g"; }


      DateTime dateTime = new DateTime();



    // $ANTLR start "datetime"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:14:1: datetime : ^( DATE_TIME date ( time )? ) ;
    public final void datetime() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:18:3: ( ^( DATE_TIME date ( time )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:18:5: ^( DATE_TIME date ( time )? )
            {
            match(input,DATE_TIME,FOLLOW_DATE_TIME_in_datetime54); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_date_in_datetime56);
            date();

            state._fsp--;

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:18:22: ( time )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EXPLICIT_TIME) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:18:22: time
                    {
                    pushFollow(FOLLOW_time_in_datetime58);
                    time();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }


                dateTime.getDate();  
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "datetime"


    // $ANTLR start "date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:21:1: date : ( relative_date | explicit_date );
    public final void date() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:22:3: ( relative_date | explicit_date )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RELATIVE_DATE) ) {
                alt2=1;
            }
            else if ( (LA2_0==EXPLICIT_DATE) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:22:5: relative_date
                    {
                    pushFollow(FOLLOW_relative_date_in_date74);
                    relative_date();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:23:5: explicit_date
                    {
                    pushFollow(FOLLOW_explicit_date_in_date81);
                    explicit_date();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "date"


    // $ANTLR start "time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:26:1: time : explicit_time ;
    public final void time() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:27:3: ( explicit_time )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:27:5: explicit_time
            {
            pushFollow(FOLLOW_explicit_time_in_time96);
            explicit_time();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "time"


    // $ANTLR start "explicit_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:30:1: explicit_date : ^( EXPLICIT_DATE MONTH DAY ( YEAR )? ( ERA )? ) ;
    public final void explicit_date() throws RecognitionException {
        CommonTree MONTH1=null;

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:31:3: ( ^( EXPLICIT_DATE MONTH DAY ( YEAR )? ( ERA )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:31:5: ^( EXPLICIT_DATE MONTH DAY ( YEAR )? ( ERA )? )
            {
            match(input,EXPLICIT_DATE,FOLLOW_EXPLICIT_DATE_in_explicit_date110); 

            match(input, Token.DOWN, null); 
            MONTH1=(CommonTree)match(input,MONTH,FOLLOW_MONTH_in_explicit_date112); 
            match(input,DAY,FOLLOW_DAY_in_explicit_date114); 
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:31:31: ( YEAR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==YEAR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:31:31: YEAR
                    {
                    match(input,YEAR,FOLLOW_YEAR_in_explicit_date116); 

                    }
                    break;

            }

            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:31:37: ( ERA )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ERA) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:31:37: ERA
                    {
                    match(input,ERA,FOLLOW_ERA_in_explicit_date119); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
            System.out.println((MONTH1!=null?MONTH1.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_date"


    // $ANTLR start "relative_date"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:35:1: relative_date : ( ^( RELATIVE_DATE DIRECTION INTEGER ) | ^( RELATIVE_DATE DIRECTION DAY_OF_WEEK ) | ^( RELATIVE_DATE DIRECTION date_frame ) );
    public final void relative_date() throws RecognitionException {
        CommonTree DIRECTION2=null;
        CommonTree INTEGER3=null;
        CommonTree DIRECTION4=null;
        CommonTree DAY_OF_WEEK5=null;
        CommonTree DIRECTION6=null;
        DateWalker.date_frame_return date_frame7 = null;


        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:37:3: ( ^( RELATIVE_DATE DIRECTION INTEGER ) | ^( RELATIVE_DATE DIRECTION DAY_OF_WEEK ) | ^( RELATIVE_DATE DIRECTION date_frame ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RELATIVE_DATE) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==DIRECTION) ) {
                        switch ( input.LA(4) ) {
                        case INTEGER:
                            {
                            alt5=1;
                            }
                            break;
                        case DAY_OF_WEEK:
                            {
                            alt5=2;
                            }
                            break;
                        case DATE_FRAME:
                        case YEAR_DATE_FRAME:
                            {
                            alt5=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:37:5: ^( RELATIVE_DATE DIRECTION INTEGER )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date144); 

                    match(input, Token.DOWN, null); 
                    DIRECTION2=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_relative_date146); 
                    INTEGER3=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_relative_date148); 

                    match(input, Token.UP, null); 
                    System.out.println(DIRECTION2 + " " + INTEGER3 + " days");

                    }
                    break;
                case 2 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:41:5: ^( RELATIVE_DATE DIRECTION DAY_OF_WEEK )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date171); 

                    match(input, Token.DOWN, null); 
                    DIRECTION4=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_relative_date173); 
                    DAY_OF_WEEK5=(CommonTree)match(input,DAY_OF_WEEK,FOLLOW_DAY_OF_WEEK_in_relative_date175); 

                    match(input, Token.UP, null); 
                    dateTime.moveToDayOfWeek((DIRECTION4!=null?DIRECTION4.getText():null), (DAY_OF_WEEK5!=null?DAY_OF_WEEK5.getText():null));

                    }
                    break;
                case 3 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:45:5: ^( RELATIVE_DATE DIRECTION date_frame )
                    {
                    match(input,RELATIVE_DATE,FOLLOW_RELATIVE_DATE_in_relative_date195); 

                    match(input, Token.DOWN, null); 
                    DIRECTION6=(CommonTree)match(input,DIRECTION,FOLLOW_DIRECTION_in_relative_date197); 
                    pushFollow(FOLLOW_date_frame_in_relative_date199);
                    date_frame7=date_frame();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    System.out.println(DIRECTION6 + " one " + (date_frame7!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(date_frame7.start),
                      input.getTreeAdaptor().getTokenStopIndex(date_frame7.start))):null));

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relative_date"

    public static class date_frame_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "date_frame"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:49:1: date_frame : ( DATE_FRAME | YEAR_DATE_FRAME );
    public final DateWalker.date_frame_return date_frame() throws RecognitionException {
        DateWalker.date_frame_return retval = new DateWalker.date_frame_return();
        retval.start = input.LT(1);

        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:50:3: ( DATE_FRAME | YEAR_DATE_FRAME )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:
            {
            if ( (input.LA(1)>=DATE_FRAME && input.LA(1)<=YEAR_DATE_FRAME) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "date_frame"


    // $ANTLR start "explicit_time"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:54:1: explicit_time : ^( EXPLICIT_TIME INTEGER INTEGER ( AM_PM )? ) ;
    public final void explicit_time() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:55:3: ( ^( EXPLICIT_TIME INTEGER INTEGER ( AM_PM )? ) )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:55:5: ^( EXPLICIT_TIME INTEGER INTEGER ( AM_PM )? )
            {
            match(input,EXPLICIT_TIME,FOLLOW_EXPLICIT_TIME_in_explicit_time244); 

            match(input, Token.DOWN, null); 
            match(input,INTEGER,FOLLOW_INTEGER_in_explicit_time246); 
            match(input,INTEGER,FOLLOW_INTEGER_in_explicit_time248); 
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:55:37: ( AM_PM )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AM_PM) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:55:37: AM_PM
                    {
                    match(input,AM_PM,FOLLOW_AM_PM_in_explicit_time250); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_time"


    // $ANTLR start "prefixable_target"
    // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:58:1: prefixable_target : ( DAY_OF_WEEK | DATE_FRAME );
    public final void prefixable_target() throws RecognitionException {
        try {
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:59:3: ( DAY_OF_WEEK | DATE_FRAME )
            // /Users/joe/java_workspace/natty/src/main/antlr3/grammar/com/natty/parse/DateWalker.g:
            {
            if ( input.LA(1)==DAY_OF_WEEK||input.LA(1)==DATE_FRAME ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prefixable_target"

    // Delegated rules


 

    public static final BitSet FOLLOW_DATE_TIME_in_datetime54 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_date_in_datetime56 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_time_in_datetime58 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_relative_date_in_date74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_date_in_date81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_time_in_time96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLICIT_DATE_in_explicit_date110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MONTH_in_explicit_date112 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DAY_in_explicit_date114 = new BitSet(new long[]{0x0000000000002108L});
    public static final BitSet FOLLOW_YEAR_in_explicit_date116 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_ERA_in_explicit_date119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_relative_date146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_relative_date148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date171 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_relative_date173 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DAY_OF_WEEK_in_relative_date175 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RELATIVE_DATE_in_relative_date195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DIRECTION_in_relative_date197 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_date_frame_in_relative_date199 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_date_frame0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPLICIT_TIME_in_explicit_time244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEGER_in_explicit_time246 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_INTEGER_in_explicit_time248 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_AM_PM_in_explicit_time250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_prefixable_target0 = new BitSet(new long[]{0x0000000000000002L});

}