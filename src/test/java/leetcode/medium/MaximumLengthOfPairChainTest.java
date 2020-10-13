package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PV029500 on 7/25/2017.
 */
public class MaximumLengthOfPairChainTest {

    @Test
    public void maximumTest() {
//        int[][] pairs = new int[][]{{0,1}, {2,3}, {4,5}, {5, 9}, {6, 9}, {10, 11}};
        int[][] pairs = new int[][]{{912,984},{216,679},{-864,308},{-300,480},{-618,-154},{-780,445},{-289,989},{-958,706},{-844,282},{249,367},{803,867},{567,884},{-792,-170},{-626,629},{663,762},{-739,-717},{-956,979},{596,868},{594,759},{-562,608},{663,986},{-675,115},{-560,583},{-221,250},{897,918},{952,956},{-664,604},{287,727},{933,956},{-133,-23},{-963,683},{745,795},{-511,804},{1,240},{-393,911},{165,597},{993,994},{-957,-192},{-322,53},{-243,628},{-503,-192},{-133,21},{-209,319},{-839,-56},{887,891},{340,433},{-170,355},{18,313},{-37,64},{462,468},{391,506},{219,442},{315,804},{6,700},{223,762},{751,960},{-645,168},{-265,946},{-438,109},{839,926},{185,715},{460,879},{-834,-384},{-902,-364},{264,471},{171,898},{685,1000},{-464,-227},{465,704},{181,592},{-20,148},{-232,842},{450,988},{669,725},{-183,14},{-320,720},{575,965},{-772,-4},{-833,422},{-788,-267},{54,492},{-995,-310},{521,970},{-577,-500},{590,786},{179,715},{-198,588},{770,915},{-804,244},{-106,512},{285,937},{829,833},{-735,40},{103,729},{791,898},{873,993},{441,996},{-839,632},{284,434},{-474,730},{-117,684},{-14,120},{699,805},{442,590},{37,393},{-815,177},{116,325},{384,820},{-537,236},{-7,768},{431,839},{-93,534},{22,104},{298,904},{132,432},{-696,947},{454,615},{-338,643},{344,490},{765,969},{34,224},{25,310},{856,957},{-822,-736},{-148,927},{-499,-70},{-632,-301},{235,776},{156,474},{-558,822},{828,947},{-776,643},{324,398},{-351,479},{601,602},{-780,-487},{-923,-461},{-126,729},{607,760},{-732,91},{48,281},{150,455},{747,880},{42,264},{219,769},{-653,286},{576,771},{-616,-185},{-603,516},{-387,671},{-882,93},{338,515},{337,900},{413,997},{-200,-54},{147,845},{-254,649},{483,789},{362,884},{385,710},{-272,593},{-63,924},{555,984},{435,951},{635,877},{-104,395},{-727,83},{-175,-64},{90,576},{397,672},{585,865},{-887,486},{476,525},{243,330},{561,937},{985,992},{352,737},{398,702},{744,953},{281,811},{103,685},{-57,454},{-116,425},{-944,340},{-26,214},{-237,188},{55,123},{129,133},{-29,653},{673,974},{238,809},{439,763},{-818,-634},{-270,440},{686,959},{-942,-359},{932,947},{-364,589},{-369,-254},{341,381},{-695,103},{895,922},{53,999},{-633,76},{384,424},{-597,198},{-467,201},{778,914},{772,862},{243,798},{-946,-444},{974,994},{917,980},{673,706},{971,998},{477,787},{-641,588},{-212,504},{-659,406},{584,722},{-431,414},{-321,943},{-568,965},{-394,709},{631,791},{-948,851},{-36,415},{-906,10},{-312,704},{-398,379},{544,552},{395,562},{279,900},{552,701},{946,996},{355,537},{-615,-232},{-600,-551},{-454,35},{-900,-658},{172,173},{710,771},{-399,-247},{905,958},{-108,621},{833,902},{600,757},{987,997},{805,926},{652,877},{-75,52},{946,975},{295,567},{-632,-211},{974,988},{579,869},{-218,55},{-901,-399},{-228,743},{627,771},{583,671},{-931,-15},{-413,3},{803,960},{590,913},{405,777},{-611,206},{733,972},{305,672},{661,989},{328,504},{189,586},{89,519},{833,997},{-579,486},{894,972},{-751,-186},{-759,369},{520,967},{182,802},{-244,27},{-551,566},{381,793},{288,957},{-482,-380},{294,922},{833,971},{688,994},{-656,80},{369,381},{-227,929},{631,690},{964,993},{-471,-183},{-684,907},{-747,330},{-748,181},{398,986},{358,510},{-806,45},{674,896},{661,706},{-147,645},{-779,240},{637,949},{278,476},{408,996},{30,470},{-846,210},{-75,747},{-472,248},{808,899},{736,769},{51,289},{-907,-670},{-825,350},{517,601},{843,951},{-772,604},{471,985},{203,971},{-135,700},{-212,692},{-400,154},{785,997},{-761,-178},{-481,-341},{559,570},{-206,501},{-164,681},{-753,-92},{726,980},{646,948},{211,665},{-746,60},{-158,171},{-584,555},{366,809},{774,780},{192,349},{-277,515},{-304,661},{843,944},{-834,-459},{-582,479},{-748,393},{-729,661},{-404,493},{975,999},{-401,824},{-232,152},{-624,888},{-898,440},{-463,861},{951,980},{638,640},{-556,780},{-49,388},{-439,245},{-822,-778},{776,867},{183,856},{-17,825},{673,782},{-546,161},{904,939},{-811,-690},{204,256},{685,962},{190,332},{-19,983},{406,580},{893,898},{502,688},{-930,581},{-918,375},{-398,76},{844,924},{997,998},{401,836},{478,666},{-338,704},{370,628},{884,896},{-248,521},{-681,-568},{-559,429},{202,946},{407,529},{-784,438},{-259,9},{-828,326},{-780,349},{-695,499},{388,593},{-117,694},{136,551},{409,615},{710,807},{-994,800},{279,667},{-185,668},{-770,448},{-427,-386},{-173,-37},{981,990},{-958,-533},{695,729},{-614,-304},{579,698},{735,739},{719,781},{936,982},{-230,342},{-104,1},{675,702},{798,890},{321,988},{-285,548},{-431,-92},{-649,205},{-42,887},{-385,-79},{-351,-166},{409,953},{-613,266},{-569,-296},{353,682},{326,951},{-950,78},{-152,653},{-846,756},{487,575},{384,460},{513,650},{613,755},{-928,1},{-54,658},{-123,567},{-143,54},{-38,970},{259,265},{-736,-307},{139,457},{626,960},{-554,-507},{-410,949},{534,784},{-735,-203},{263,760},{869,945},{-250,-248},{-845,-815},{958,972},{618,827},{-386,-101},{498,979},{25,737},{233,469},{-560,953},{-643,-499},{-22,329},{16,901},{62,217},{770,951},{-608,298},{-359,-355},{-922,-824},{-78,550},{-691,-243},{885,985},{919,998},{739,984},{685,933},{752,817},{-279,-229},{-717,-498},{612,804},{-437,-362},{-722,-624},{117,287},{-782,-90},{-776,369},{-898,77},{-293,245},{-849,-717},{899,912},{-197,543},{475,945},{-809,-493},{124,576},{-496,5},{968,989},{-7,593},{-329,80},{-242,828},{-815,-350},{733,993},{586,949},{479,899},{481,765},{974,1000},{991,994},{732,916},{-243,708},{341,785},{178,864},{-600,95},{231,654},{401,540},{-684,581},{-106,649},{702,717},{-727,-550},{-10,266},{792,992},{-795,-724},{-272,323},{-659,435},{507,877},{352,761},{-994,579},{-76,737},{701,841},{-402,-11},{-275,392},{265,336},{234,793},{730,819},{-483,904},{742,944},{-269,280},{131,151},{-605,337},{755,952},{-797,306},{905,966},{-837,-46},{954,956},{267,539},{-78,684},{-350,504},{-438,-68},{809,950},{993,998},{289,943},{562,691},{584,943},{-63,874},{-1,628},{535,669},{-379,527},{443,855},{-227,-209},{-96,-41},{-7,904},{917,991},{-99,316},{504,691},{726,892},{-622,130},{-3,511},{106,372},{450,625},{434,965},{-399,124},{-526,821},{-944,539},{-37,934},{-170,735},{526,876},{-277,881},{-26,50},{25,480},{-155,511},{5,523},{275,528},{-523,523},{130,864},{983,1000},{771,862},{193,409},{-250,791},{-806,212},{-261,567},{-442,280},{163,288},{-849,-453},{545,862},{-276,370},{906,926},{-160,-151},{188,403},{-134,560},{16,421},{-65,689},{14,49},{861,963},{-975,693},{259,872},{-891,876},{338,491},{95,697},{24,241},{-290,-44},{946,959},{-930,-492},{425,960},{-239,988},{710,814},{207,370},{-496,-62},{602,684},{582,797},{798,990},{655,784},{605,924},{-870,-92},{-195,690},{-383,756},{-778,-745},{-688,69},{-214,152},{-713,-443},{-40,856},{859,889},{-543,-353},{-151,923},{550,796},{-590,-501},{-719,-550},{-180,798},{960,966},{554,730},{132,778},{-734,957},{-415,13},{712,925},{-845,303},{-572,200},{-272,698},{881,945},{244,871},{-627,460},{-161,-119},{-726,-64},{785,956},{550,967},{-775,412},{934,953},{970,982},{484,761},{-441,782},{523,803},{-345,525},{304,320},{512,608},{-266,142},{-370,894},{59,109},{-665,985},{71,890},{608,825},{-209,-84},{652,946},{-524,-253},{-129,373},{-871,-375},{-504,868},{411,741},{716,890},{-606,966},{693,890},{-340,815},{-734,-14},{-382,804},{-462,616},{968,998},{994,996},{-42,293},{948,970},{477,516},{527,891},{-12,494},{-878,537},{633,969},{381,476},{356,418},{716,758},{106,267},{-9,841},{-705,443},{190,792},{683,739},{26,887},{862,916},{296,308},{-996,844},{-959,-2},{537,807},{-548,500},{-936,-304},{-349,200},{-56,133},{-483,-298},{-749,931},{-378,128},{-582,666},{-738,-256},{553,616},{-674,-363},{899,940},{62,410},{-694,182},{-667,934},{838,981},{532,709},{-808,-180},{61,797},{-592,8},{-22,537},{-930,73},{907,962},{-127,742},{-236,593},{862,951},{-174,-61},{681,898},{-438,491},{-497,-229},{97,787},{-345,-332},{-70,628},{706,806},{-953,540},{692,715},{503,830},{791,911},{416,716},{-350,504},{332,748},{-952,-651},{43,840},{712,799},{-653,278},{-509,311},{609,979},{390,669},{-894,-511},{-864,462},{593,779},{927,976},{-53,512},{300,849},{-130,332},{787,953},{824,981},{-817,-386},{-529,-306},{-688,-623},{111,719},{-55,-9},{-490,609},{149,414},{-200,703},{-235,194},{-58,449},{468,663},{-412,-47},{-481,-142},{580,889},{590,750},{215,232},{-638,570},{405,690},{44,295},{-681,-647},{833,980},{544,969},{-685,-358},{-418,572},{-280,189},{-286,226},{-305,720},{422,753},{-765,157},{-25,695},{-810,-189},{-676,-200},{227,658},{-855,-258},{-211,597},{288,713},{291,997},{-341,967},{-126,452},{550,959},{-867,233},{11,144},{-365,225},{-937,-261},{-438,730},{-1,530},{358,838},{-251,213},{-263,54},{66,368},{998,999},{-292,648},{-455,-92},{658,676},{566,967},{565,841},{-543,-174},{-492,57},{-758,-736},{207,647},{-742,-542},{807,971},{373,503},{-591,209},{221,369},{180,202},{-49,568},{330,575},{-290,118},{-321,-63},{-571,604},{-89,16},{511,680},{679,980},{-719,-164},{713,937},{57,713},{-456,-308},{453,884},{729,862},{-466,994},{26,260},{-53,901},{-838,57},{-194,96},{-391,-79},{-233,-157},{613,939},{-146,-45},{-879,-200},{673,789},{950,979},{972,987},{-41,191},{-661,448},{61,725},{912,948},{910,952},{516,829},{-331,644},{-686,-319},{-90,120},{-346,-55},{-494,667},{-941,371},{407,842},{-922,329},{764,845},{640,926},{-400,-114},{136,678},{-974,566},{-920,-525},{493,982},{275,439},{-445,-89},{-715,175},{-852,550},{-184,432}};
        MaximumLengthOfPairChain maximumLengthOfPairChain = new MaximumLengthOfPairChain();
        System.out.println(maximumLengthOfPairChain.findLongestChain(pairs));
    }
}