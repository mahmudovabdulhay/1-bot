package com.company;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class BotService extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "t.me/asriqissalari_bot";
    }

    @Override
    public String getBotToken() {
        return "6151803463:AAEZeZpZKRbryddL1xPt6_gLcm097rfDcxg";
    }

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage returnMessage = new SendMessage();
        Message message = update.getMessage();
        System.out.println(update.getMessage().getFrom().getFirstName());
        System.out.println(update.getMessage().getFrom().getLastName());
        System.out.println(update.getMessage().getFrom().getUserName());
        System.out.println(update.getMessage().getContact());
        String text = message.getText();

        if (message.hasText()) {

            if (text.equals("/start")) {
                returnMessage = handleStart(message);

            }
            if (text.equals("Birinchi kitob \uD83D\uDCD8")) {
                returnMessage = handleBirinchiKitob(message);
            }
            if (text.equals("Ortga qaytish↪")) {
                returnMessage = handleStart(message);
            }
            if (text.equals("Ikkinchi kitob \uD83D\uDCD4")) {
                returnMessage = handleIkkinchiKitob(message);
            }

            if (text.equals("Uchunchi kitob \uD83D\uDCD3")) {
                returnMessage = handleUchunchiKitob(message);
            }
            if (text.equals("To`rtinchi kitob \uD83D\uDCD5")) {
                returnMessage = handleTurtinchiKitob(message);
            }
            if (text.equals("1-qism Muqaddima")) {
                returnMessage = handlemuqaddima(message);
            }
            if (text.equals("2-qim Kaba yiqiladimi?")) {
                returnMessage = handleyiqiladimi(message);
            }
            if (text.equals("3-qism Kaba yiqiladimi 2")) {
                returnMessage = handleyiqiladimi2(message);
            }
            if (text.equals("4-qism Mavlidi Nabaviy")) {
                returnMessage = handleNabaviy(message);
            }
            if (text.equals("5-qism Bani Sa'd yurtida")) {
                returnMessage = handleSadyurtida(message);
            }
            if (text.equals("6-qism Abvoda qazilgan mozor")) {
                returnMessage = handleMozor(message);
            }
            if (text.equals("7-qism Abdulmuttalibning mehr quchog'i")) {
                returnMessage = handleMehrquchogi(message);
            }
            if (text.equals("8-qism Zam Zam")) {
                returnMessage = handleZamzam(message);
            }
            if (text.equals("9-qism Bir qurbon-Yuz qurbon")) {
                returnMessage = handleyuzQurbon(message);
            }
            if (text.equals("10 qism Azim darxtning qulashi")) {
                returnMessage = handledarxtiningQulashi(message);
            }
            if (text.equals("11-qism Abu Tolibning xonadonida")) {
                returnMessage = handleXonadonida(message);
            }
            if (text.equals("12-qism Bulutlarga qilingan ishora")) {
                returnMessage = handleBulutlarga(message);
            }
            if (text.equals("13-qism Shom safari")) {
                returnMessage = handleShomsafari(message);
            }
            if (text.equals("14-qism Suiqasd qilishmoqchi")) {
                returnMessage = handleSuiqast(message);
            }
            if (text.equals("15-qism Yana butlar qoshida")) {
                returnMessage = handleBulutlar(message);
            }
            if (text.equals("16-qism Arslon bolasi")) {
                returnMessage = handleArslonBolasi(message);
            }
            if (text.equals("17-qism Fijor urushi")) {
                returnMessage = handleFijor(message);
            }
            if (text.equals("18-qism Sharafli ahdlashuv")) {
                returnMessage = handleAhdlashuv(message);
            }
            if (text.equals("19-qism Salmon Forsiy")) {
                returnMessage = handleForsiy(message);
            }
            if (text.equals("20-qism Hadichaning savdo karvoni")) {
                returnMessage = handleSavdoKArvoni(message);
            }
            if (text.equals("21-qism Baxtli nikoh")) {
                returnMessage = handlenikoh(message);
            }
            if (text.equals("22-qism Jasur bir bola")) {
                returnMessage = handleJasurBola(message);
            }
            if (text.equals("23-qism Suyukli kichkina mahbus")) {
                returnMessage = handleKichkinaMahbus(message);
            }
            if (text.equals("24-qism Dardli bir ota")) {
                returnMessage = handleDardliOta(message);
            }
            if (text.equals("25-qism Ka'ba hakamligi")) {
                returnMessage = handleKabaHakamligi(message);
            }
            if (text.equals("26-qism Yana Salmon")) {
                returnMessage = handleYanaSalmon(message);
            }
            if (text.equals("27-qism Yahudiy olimlari")) {
                returnMessage = handleYahudiyOlimlari(message);
            }
            if (text.equals("28-qism Haq din yo'lida")) {
                returnMessage = handleHaqDinyulida(message);
            }
            if (text.equals("29-qism Ukoz bozori")) {
                returnMessage = handleUkozBozori(message);
            }
            if (text.equals("30-qism Intizor kutilgan tong")) {
                returnMessage = handlekutilganTong(message);
            }
            if (text.equals("31-qism Oydinliklar sari")) {
                returnMessage = handleOydinliklar(message);
            }
            if (text.equals("32-qism Ochiq da'vat sari ilk odim")) {
                returnMessage = handleOchiqDavat(message);
            }
            if (text.equals("33-qism Nizo va qiynoqlar")) {
                returnMessage = handleNIzovaQiynoqlar(message);
            }
            if (text.equals("34-qism Bilol Habashiy")) {
                returnMessage = handleBilol(message);
            }
            if (text.equals("35-qism Yosir oilasi va Ammor")) {
                returnMessage = handleYosizOilasi(message);
            }
            if (text.equals("36-qism Amr ibn Hishom Abu Jahl")) {
                returnMessage = handleabujahl(message);
            }
            if (text.equals("37-qism Esli-hushli qariya")) {
                returnMessage = handleEsliqariya(message);
            }
            if (text.equals("38-qism Eskilardan qolgan bir afsona")) {
                returnMessage = handleAfsona(message);
            }
            if (text.equals("39-qism Hojilarga nima deymiz?")) {
                returnMessage = handleHOojilarganimadeymiz(message);
            }
            if (text.equals("40-qism Jahannamni qo'riqlaydigan 19 malak")) {
                returnMessage = ahandle19malak(message);
            }
            if (text.equals("41-qism O'limdan keyinga doir")) {
                returnMessage = handleUlimdanKeyingaDoir(message);
            }
            if (text.equals("42-qism Vahiyning bir muddat to'xtab qolishi")) {
                returnMessage = handleVahiyning(message);
            }
            if (text.equals("43-qism Vijdon azobi va ovchi yigit")) {
                returnMessage = handleVIjdonAzobi(message);
            }
            if (text.equals("44-qism Maxsus bir duo")) {
                returnMessage = handleMaxsusBirDuo(message);
            }
            if (text.equals("45-qism Habashiston sari")) {
                returnMessage = handleHabashiston(message);
            }
            if (text.equals("46-qism Favqulotda bir taklif")) {
                returnMessage = handleTaklif(message);
            }
            if (text.equals("47-qism Habashiston sari yana bir safar")) {
                returnMessage = handleYanaHabashiston(message);
            }
            if (text.equals("48-qism Haqli bo'lish yetarlimi?")) {
                returnMessage = handleHAqliBulish(message);
            }
            if (text.equals("49-qism Buyuk mo'jiza")) {
                returnMessage = handleBuyukmujiza(message);
            }
            if (text.equals("50-qism G'arazli istaklar")) {
                returnMessage = handleIstaklar(message);
            }
            if (text.equals("51-qism Duo qabul etildi")) {
                returnMessage = handleDuoQabulEtildi(message);
            }
            if (text.equals("52-qism Yakkama-yakka olishuv")) {
                returnMessage = handleYakkamaYakkaOlishuv(message);
            }
            if (text.equals("53-qism Asxobi Kahf")) {
                returnMessage = handleAsxobiKahf(message);
            }
            if (text.equals("54-qism Hazrati Muso va Hizir")) {
                returnMessage = handleMusovaHizr(message);
            }
            if (text.equals("55-qism Chirigan suyaklar")) {
                returnMessage = handleSuyaklar(message);
            }
            if (text.equals("56-qism Mo'minning yashashga haqqi bormi?")) {
                returnMessage = handleHaqqiBormi(message);
            }
            if (text.equals("57-qism Til bilmas temirchi")) {
                returnMessage = handletemirchi(message);
            }
            if (text.equals("58-qism Mashhur shoir Osha qanday aldandi?")) {
                returnMessage = handleOsha(message);
            }
            if (text.equals("59-qism Qayg'u yili")) {
                returnMessage = handleQayguYili(message);
            }
            if (text.equals("60-qism Yana bir mislsiz yo'qotish")) {
                returnMessage = handleYuqotish(message);
            }
            if (text.equals("61-qism Toif safari")) {
                returnMessage = handleToif(message);
            }
            if (text.equals("62-qism Buyuk da'vat va tasalli (Meroj)")) {
                returnMessage = handleMeroj(message);
            }
            if (text.equals("63-qism Bozorlarda qilingan da'vat")) {
                returnMessage = handleBozorlarda(message);
            }
            if (text.equals("64-qism Yasrib imon qarorgohiga aylanadi")) {
                returnMessage = handleYAsribimonyurti(message);
            }
            if (text.equals("65-qism Iymon yurti Yasribga hijrat")) {
                returnMessage = handleYasribgaHijrat(message);
            }
            if (text.equals("66-qism Buyuk Umarning Makkani tark etishi")) {
                returnMessage = handleUmarningTarkEtishi(message);
            }
            if (text.equals("67-qism Suiqasd qarori")) {
                returnMessage = handleSuiqasdQarori(message);
            }
            if (text.equals("68-qism G'ordan chiqish")) {
                returnMessage = handleGordanChiqish(message);
            }
            if (text.equals("69-qism Yasribda mujda saslari")) {
                returnMessage = handleMujdaSaslari(message);
            }
            if (text.equals("70-qism Yasribga harakat. Ilk juma namozi")) {
                returnMessage = handleIlkJuma(message);
            }
            if (text.equals("71-qism Hijrat yurtida zafarlar (1-qism)")) {
                returnMessage = handleHijratYurtida1(message);
            }
            if (text.equals("72-qism Hijrat yurtida zafarlar (2-qism)")) {
                returnMessage = handleHijratYurtida2(message);
            }
            if (text.equals("73-qism Hijrat yurtida zafarlar (3-qism)")) {
                returnMessage = handleHijratYurtida3(message);
            }
            if (text.equals("74-qism Hijrat yurtida zafarlar (4-qism)")) {
                returnMessage = handleHijratYurtida4(message);
            }
            if (text.equals("75-qism Hijrat yurtida zafarlar (5-qism)")) {
                returnMessage = handleHijratYurtida5(message);
            }
            if (text.equals("76-qism Hijrat yurtida zafarlar (6-qism)")) {
                returnMessage = handleHijratYurtida6(message);
            }
            if (text.equals("77-qism Hijrat yurtida zafarlar (7-qism)")) {
                returnMessage = handleHijratYurtida7(message);
            }
            if (text.equals("78-qism Hijrat yurtida zafarlar (8-qism)")) {
                returnMessage = handleHijratYurtida8(message);
            }
            if (text.equals("79-qism Ikki qiblali masjid")) {
                returnMessage = handleMasjid1(message);
            }
            if (text.equals("80-qism Ikki qiblali masjid (2-qism)")) {
                returnMessage = handleMasjid2(message);
            }
            if (text.equals("81-qism. IKKI QIBLALI MASJID-3")) {
                returnMessage = handleMasjid3(message);
            }
            if (text.equals("82-qism. IKKI QIBLALI MASJID-4")) {
                returnMessage = handleMasjid4(message);
            }
            if (text.equals("83-qism. IKKI QIBLALI MASJID-5")) {
                returnMessage = handleMasjid5(message);
            }
            if (text.equals("84-qism. IKKI QIBLALI MASJID-6")) {
                returnMessage = handleMasjid6(message);
            }
            if (text.equals("85-qism Badr intiqomi uchun qasam (1-qism)")) {
                returnMessage = handleBadrintiqomi1(message);
            }
            if (text.equals("86-qism Badr intiqomi uchun qasam (2-qism)")) {
                returnMessage = handleBadrintiqomi2(message);
            }
            if (text.equals("87-qism Badr intiqomi uchun qasam (3-qism)")) {
                returnMessage = handleBadrintiqomi3(message);
            }
            if (text.equals("88-qism Badr intiqomi uchun qasam (4-qism)")) {
                returnMessage = handleBadrintiqomi4(message);
            }
            if (text.equals("89-qism Badr intiqomi uchun qasam (5-qism)")) {
                returnMessage = handleBadrintiqomi5(message);
            }
            if (text.equals("90-qism Badr intiqomi uchun qasam (6-qism)")) {
                returnMessage = handleBadrintiqomi6(message);
            }
            if (text.equals("91-qism Badr intiqomi uchun qasam (7-qism)")) {
                returnMessage = handleBadrintiqomi7(message);
            }
            if (text.equals("92-qism Badr intiqomi uchun qasam (8-qism)")) {
                returnMessage = handleBadrintiqomi8(message);
            }
            if (text.equals("93-qism Badr intiqomi uchun qasam (9-qism)")) {
                returnMessage = handleBadrintiqomi9(message);
            }
            if (text.equals("94-qism Badr intiqomi uchun qasam (10-qism)")) {
                returnMessage = handleBadrintiqomi10(message);
            }
            if (text.equals("95-qism Badr intiqomi uchun qasam (11-qism)")) {
                returnMessage = handleBadrintiqomi11(message);
            }
            if (text.equals("96-qism Badr intiqomi uchun qasam (12-qism)")) {
                returnMessage = handleBadrintiqomi12(message);
            }
            if (text.equals("97-qism Uhud jangi Amakidan olingan maktub")) {
                returnMessage = handleTopshiriq(message);
            }
            if (text.equals("98-qism Jangdan bir kun burun")) {
                returnMessage = handleJAngdanOldin(message);
            }
            if (text.equals("99-qism Uhut tog`i sari")) {
                returnMessage = handleUhudSari(message);
            }
            if (text.equals("100-qism Yakkama-yakka olishuvlar")) {
                returnMessage = handleOlishuvlar(message);
            }
            if (text.equals("101-qism Shahidlar ulug`i hazrati Hamza")) {
                returnMessage = handleShahidlarUlugi(message);
            }
            if (text.equals("102-qism Shahidlar ulug`i hazrati Hamza (2-qism)")) {
                returnMessage = handleShahidlarUlugi1(message);
            }
            if (text.equals("103-qism Abu Sufyon va Hazrati Hamza")) {
                returnMessage = handleabuSufyon(message);
            }
            if (text.equals("104-qism Bir yildan keyin Badrda uchrashamiz")) {
                returnMessage = handleBadrdaUchrashamiz(message);
            }
            if (text.equals("105-qism Uhutdan qaytish")) {
                returnMessage = handleabuUhuddaQaytish(message);
            }
            if (text.equals("106-qism Taqib Hamroul Asad safari")) {
                returnMessage = handleHamroulAsad(message);
            }
            if (text.equals("107-qism Buyuk Mavloning Uhutga bergan qiymatlari")) {
                returnMessage = handleBuyukMavlo(message);
            }
            if (text.equals("108-qism Makkaga Hush xabar")) {
                returnMessage = handleMakkagaHushxabar(message);
            }
            if (text.equals("109-qism Asad o`g`illariga berilgan dars")) {
                returnMessage = handleAsadugillariga(message);
            }
            if (text.equals("110-qism Raji arig`i yonidagi xiyonat")) {
                returnMessage = hanndleRajiArigi(message);
            }
            if (text.equals("111-qism Ikki asir")) {
                returnMessage = handleIkkiAsir(message);
            }
            if (text.equals("112-qism Yahudiylar tuzog`i")) {
                returnMessage = handleYahudiylarTuzogi(message);
            }
            if (text.equals("113-qism Allohning Uyini tozalagan ayol")) {
                returnMessage = handleAllohniuyiniTozalagan(message);
            }
            if (text.equals("114-qism Miskinlarning onasi Hazrati Zaynabning vafoti")) {
                returnMessage = handleMiskinlarOnasi(message);
            }
            if (text.equals("115-qism Zotur Riqo G`azoti va Jobir")) {
                returnMessage = handleRiqogazoti(message);
            }
            if (text.equals("116-qism Ichkilikli Mehmondorchilik")) {
                returnMessage = handleMehmondorchilik(message);
            }
            if (text.equals("117-qism Ikkinchi Badr")) {
                returnMessage = handleIkkinchiBadr(message);
            }
            if (text.equals("118-qism Havas bilan boshlanib mahzunlik bilan tugagan nikoh")) {
                returnMessage = handleTugaganNikoh(message);
            }
            if (text.equals("119-qism Handaq Jangi")) {
                returnMessage = handleHandaqJangi(message);
            }
            if (text.equals("120-qism Handaq qazilmoqda")) {
                returnMessage = handleHandaqQazilmoqda(message);
            }
            if (text.equals("121-qism Barokatli bir ziyofat")) {
                returnMessage = handleBirZiyofat(message);
            }
            if (text.equals("122-qism Xiyonat")) {
                returnMessage = handleXiyonat(message);
            }
            if (text.equals("123-qism Amr Ibn Abdi Vadd")) {
                returnMessage = handleabdivadd(message);
            }
            if (text.equals("124-qism Umumiy Taaruz")) {
                returnMessage = handleTaaruz(message);
            }
            if (text.equals("125-qism Qurayza Yahudiylari sari")) {
                returnMessage = handleQurayza(message);
            }
            if (text.equals("126-Pushaymon Odam")) {
                returnMessage = handlePushaymonOdam(message);
            }
            if (text.equals("127-qism Robbiga qovushgan bir Mahbub")) {
                returnMessage = handleBirMahbub(message);
            }
            if (text.equals("128-qism Zaynab Xonim")) {
                returnMessage = handleZaynabxonim(message);
            }
            if (text.equals("129-qism Xolid ibn Sufyon")) {
                returnMessage = handleXolidIbnSufyon(message);
            }
            if (text.equals("130-qism Yana bir ichkilikli yig`in")) {
                returnMessage = handleYAnaichkilik(message);
            }
            if (text.equals("131-qism Zu qorad hodisasi")) {
                returnMessage = handleQoradhodisasi(message);
            }
            if (text.equals("132-qism Avs Ibn Somit")) {
                returnMessage = handleAvsibnSomit(message);
            }
            if (text.equals("133-qism Ibn Mas'ud Qur'on o'qimoqda")) {
                returnMessage = handleMasudQuron(message);
            }
            if (text.equals("134-qism Bani Mustaliq safari")) {
                returnMessage = handleMustaliq(message);
            }
            if (text.equals("135-qism Yo'qolgan marjon hodisasi")) {
                returnMessage = handleMarjon(message);
            }
            if (text.equals("136-qism Hodisani oydinlashtirish")) {
                returnMessage = handleOydinlashtirish(message);
            }
            if (text.equals("137-qism Vahiy keltirgan oydinlik")) {
                returnMessage = handlevahiyOydinlik(message);
            }
            if (text.equals("138-qism Tush chinga aylanayotir")) {
                returnMessage = handleChingaAylanayotir(message);
            }
            if (text.equals("139-qism Huzayma guvoh bo'ldi")) {
                returnMessage = handleHuzayma(message);
            }
            if (text.equals("140-qism Hudaybiya")) {
                returnMessage = handleHudaybiya1(message);
            }
            if (text.equals("141-qism Hudaybiya-1")) {
                returnMessage = handleHudaybiya2(message);
            }
            if (text.equals("142-qism Hudaybiya-2")) {
                returnMessage = handleHudaybiya3(message);
            }
            if (text.equals("143-qism Ummu Habiba Roziyallohu anho")) {
                returnMessage = handleUmmuHabiba(message);
            }
            if (text.equals("144-qism Haybar")) {
                returnMessage = handleHaybar(message);
            }
            if (text.equals("145-qism Haybar-2")) {
                returnMessage = handleHaybar1(message);
            }
            if (text.equals("146-qism Haybar-3")) {
                returnMessage = handleHaybar2(message);
            }
            if (text.equals("147-qism Haybar-4")) {
                returnMessage = handleHaybar3(message);
            }
            if (text.equals("148-qism Heraklga maktub")) {
                returnMessage = handleHeraklgaMAktub(message);
            }
            if (text.equals("149-qism Muvoqisga maktub")) {
                returnMessage = handleMuqovqisga(message);
            }
            if (text.equals("150-qism Xolaning kelishi")) {
                returnMessage = handleXola(message);
            }
            if (text.equals("151-qism Xansa")) {
                returnMessage = handleXansa(message);
            }
            if (text.equals("152-qism Qoldirilgan Umra")) {
                returnMessage = handleQoldirilganUmra(message);
            }
            if (text.equals("153-qism Holid Ibn Validning Islomni qabul etishi")) {
                returnMessage = handleHolidningIslomniqabulqilishi(message);
            }
            if (text.equals("154-qism Tamim qabilasi va Aqro")) {
                returnMessage = handleTamim(message);
            }
            if (text.equals("155-qism Sulaym qabilasi")) {
                returnMessage = handleSulaym(message);
            }
            if (text.equals("156-qism Tovoqning sinishi")) {
                returnMessage = handleSinishi(message);
            }
            if (text.equals("157-qism Zotus Salosil g'azoti")) {
                returnMessage = handleZotusSalosil(message);
            }
            if (text.equals("158-qism Sayful Bahr (Jayhush Habat) g'azoti")) {
                returnMessage = handleSayfulBahr(message);
            }
            if (text.equals("159-qism Mu'ta jangi")) {
                returnMessage = handleMuta(message);
            }
            if (text.equals("160-qism Mu'ta jangi 2")) {
                returnMessage = handleMuta2(message);
            }
            if (text.equals("161-qism Hazrati Umarning o'giti")) {
                returnMessage = handleHazratUamrning(message);
            }
            if (text.equals("162-qism Makka fathi")) {
                returnMessage = handleMakkaFathi(message);
            }
            if (text.equals("163-qism Makka fathi ashulachi xotin")) {
                returnMessage = handleMakkaFathiAshulachi(message);
            }
            if (text.equals("164-qism Makka fathi Abu Sufyon va sheriklari")) {
                returnMessage = handleAbusufyonSheriklari(message);
            }
            if (text.equals("165-qism Makkaga kirish")) {
                returnMessage = handleMakkagairish(message);
            }
            if (text.equals("166 qism Fath xutbasi")) {
                returnMessage = handleFathXutbasi(message);
            }
            if (text.equals("167-qism Bayʼat marosimi")) {
                returnMessage = handleBAyatMarosimi(message);
            }
            if (text.equals("168 bu-qism Bayʼat marosimi 2")) {
                returnMessage = handleBAyatMarosimi2(message);
            }
            if (text.equals("169-qism Hunayn qamali")) {
                returnMessage = handleHunaynQamali(message);
            }
            if (text.equals("170-qism Hunayn qamali 2")) {
                returnMessage = handleHunaynQamali2(message);
            }
            if (text.equals("171-qism Hunayn qamali 3")) {
                returnMessage = handleHunaynQamali3(message);
            }
            if (text.equals("172-qism Hunayn qamali 4")) {
                returnMessage = handleHunaynQamali4(message);
            }
            if (text.equals("173-qism  Xuroqa safari")) {
                returnMessage = handleXuroqa(message);
            }
            if (text.equals("174-qism Kichik mehmon")) {
                returnMessage = handleKichikMehmon(message);
            }
            if (text.equals("175-qism  Ikki mozor")) {
                returnMessage = handleIkkiMozor(message);
            }
            if (text.equals("176-qism  Hazrati Zaynabning vafoti")) {
                returnMessage = handleZaynabningVafoti(message);
            }
            if (text.equals("177-qism  Hilol ibn Umayya")) {
                returnMessage = handleHIlolIbnUmayya(message);
            }
            if (text.equals("178-qism Bir shoirning oʻlimi")) {
                returnMessage = handleShoirningulimi(message);
            }
            if (text.equals("179-Islomning ilk haj amri")) {
                returnMessage = handleIlkHajAmiri(message);
            }
            if (text.equals("180-qism Ilo hodisasi")) {
                returnMessage = handleIloHodisasi(message);
            }
            if (text.equals("181-qism  Sut ziyofat")){
                returnMessage=handleSutZiyofati(message);
            }
            if (text.equals("182-qism Asad qabilasi")){
                returnMessage=handleAsadQabilasi(message);
            }
            if (text.equals("183-qism  Kaʼb ibn Zuhayr va Qasidai burda")){
                returnMessage=handleQasidaiBurda(message);
            }
            if (text.equals("184-qism Habash sultoni Najoshiy")){
                returnMessage=handleNajoshiy(message);
            }
            if (text.equals("185-qism Saqif hayʼati")){
                returnMessage=handleSaqifHayati(message);
            }
            if (text.equals("186-qism Yaxshi uylangan bir yosh")){
                returnMessage=handleUylanganYosh(message);
            }
            if (text.equals("187-qism Qabriston ziyorati")){
                returnMessage=handleQabristonZiyorati(message);
            }
            if (text.equals("188-qism Najronliklar")){
                returnMessage=handleNajronliklar(message);
            }
            if (text.equals("189-qism Tabuk safari")){
                returnMessage=handleTabuk1(message);
            }
            if (text.equals("190-qism  Tabuk safari 2")){
                returnMessage=handleTabuk2(message);
            }
            if (text.equals("191-qism Tabuk safari 3")){
                returnMessage=handleTabuk3(message);
            }
            if (text.equals("192-qism Tabuk safari 4")){
                returnMessage=handleTabuk4(message);
            }
            if (text.equals("193-qism Tabuk safari 5")){
                returnMessage=handleTabuk5(message);
            }
            if (text.equals("194-qism  E'tirof payti kelgan ziyoratchi")){
                returnMessage=handleEtirofdaKelgan(message);
            }
            if (text.equals("195-qism Bir safardan xotira")){
                returnMessage=handleBirSafardanXotira(message);
            }
            if (text.equals("196-qism Ibrohimning vafoti")){
                returnMessage=handleIbrohimningVafoti(message);
            }
            if (text.equals("197-qism  Yolgʻonchi Musaylama")){
                returnMessage=handleMusaylama(message);
            }
            if (text.equals("198-qism Rosululloh sevgan odam")){
                returnMessage=handleRasulullohSevganOdam(message);
            }
            if (text.equals("199-qism Vido haji")){
                returnMessage=handleVidoHaji(message);
            }
            if (text.equals("200-qism Vido haji 2")){
                returnMessage=handleVidoHaji2(message);
            }
            if (text.equals("201-qism Vido haji 3")){
                returnMessage=handleVidoHaji3(message);
            }
            if (text.equals("202-qism Paygʻambarimiz (s.a.v) vafotlari 1-qism")){
                returnMessage=handleVAfotlari1(message);
            }
            if (text.equals("203-qism Paygʻambarimiz (s.a.v) vafotlar 2-qism")){
                returnMessage=handleVAfotlari2(message);
            }
            if (text.equals("204-qism Paygʻambarimiz (s.a.v) vafotlari 3-qism"))
                returnMessage = handleVAfotlari3(message);
        }
        try {
            execute(returnMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private SendMessage handleVAfotlari3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/322");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleVAfotlari2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/321");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleVAfotlari1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/320");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleVidoHaji3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/319");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleVidoHaji2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/318");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleVidoHaji(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/317");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleRasulullohSevganOdam(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/316");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMusaylama(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/315");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleIbrohimningVafoti(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/314");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBirSafardanXotira(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/313");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleEtirofdaKelgan(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/312");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTabuk5(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/311");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTabuk4(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/310");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTabuk3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/309");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTabuk2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/308");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTabuk1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/307");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleNajronliklar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/306");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleQabristonZiyorati(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/305");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleUylanganYosh(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/304");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSaqifHayati(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/303");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleNajoshiy(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/302");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleQasidaiBurda(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/301");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleAsadQabilasi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/300");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSutZiyofati(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/299");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleIloHodisasi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/298");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleIlkHajAmiri(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/297");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleShoirningulimi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/296");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHIlolIbnUmayya(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/295");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleZaynabningVafoti(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/294");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleIkkiMozor(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/293");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleKichikMehmon(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/292");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleXuroqa(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/290");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHunaynQamali4(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/290");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHunaynQamali3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/289");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHunaynQamali2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/288");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHunaynQamali(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/287");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBAyatMarosimi2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/286");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBAyatMarosimi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/285");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleFathXutbasi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/284");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMakkagairish(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/283");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleAbusufyonSheriklari(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/282");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMakkaFathiAshulachi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/281");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMakkaFathi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/280");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHazratUamrning(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/279");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMuta2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/278");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMuta(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/277");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSayfulBahr(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/276");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleZotusSalosil(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/275");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSinishi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/274");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSulaym(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/273");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTamim(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/272 ");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHolidningIslomniqabulqilishi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/271");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleQoldirilganUmra(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/270");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleXansa(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/269");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleXola(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/267");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMuqovqisga(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/177");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHeraklgaMAktub(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/176");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHaybar3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/175");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHaybar2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/174");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHaybar1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/173");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHaybar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/172");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleUmmuHabiba(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/171");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHudaybiya3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/170");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHudaybiya2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/169");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHudaybiya1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/168 ");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHuzayma(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/167");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleChingaAylanayotir(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/166");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handlevahiyOydinlik(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/165");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleOydinlashtirish(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/164");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMarjon(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/163");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMustaliq(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/162");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMasudQuron(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/161");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleAvsibnSomit(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/160");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleQoradhodisasi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/159");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYAnaichkilik(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/155");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleXolidIbnSufyon(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/154");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleZaynabxonim(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/153");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBirMahbub(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/152");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handlePushaymonOdam(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/151");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleQurayza(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/150");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTaaruz(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/149");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleabdivadd(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/148");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleXiyonat(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/147");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBirZiyofat(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/141");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHandaqQazilmoqda(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/130");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHandaqJangi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/129");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTugaganNikoh(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/128");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleIkkinchiBadr(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/127");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMehmondorchilik(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/126");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleRiqogazoti(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/125");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMiskinlarOnasi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/124");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleAllohniuyiniTozalagan(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/123");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYahudiylarTuzogi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/122");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleIkkiAsir(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/121");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage hanndleRajiArigi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/120");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleAsadugillariga(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/119");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMakkagaHushxabar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/118");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBuyukMavlo(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/117");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHamroulAsad(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/116");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleabuUhuddaQaytish(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/115");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrdaUchrashamiz(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/114");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleabuSufyon(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/113");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleShahidlarUlugi1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/112");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleShahidlarUlugi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/111");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleOlishuvlar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/110");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleUhudSari(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/109");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleJAngdanOldin(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/108");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTopshiriq(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/107");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi12(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/106");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi11(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/105");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi10(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/104");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi9(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/103");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi8(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/102");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi7(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/101");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi6(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/100");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi5(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/99");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi4(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/98");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/97");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/96");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBadrintiqomi1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/95");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMasjid6(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/94");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMasjid5(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/93");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMasjid4(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/92");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMasjid3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/91");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMasjid2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/86");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMasjid1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/85");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHijratYurtida8(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/84");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHijratYurtida7(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/83");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHijratYurtida6(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/82");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHijratYurtida5(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/81");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHijratYurtida4(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/80");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHijratYurtida3(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/79");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHijratYurtida2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/78");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHijratYurtida1(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/77");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleIlkJuma(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/76");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMujdaSaslari(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/75");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleGordanChiqish(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/74");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSuiqasdQarori(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/73");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleUmarningTarkEtishi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/72");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYasribgaHijrat(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/71");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYAsribimonyurti(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/70");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBozorlarda(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/69");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMeroj(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/68");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleToif(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/67");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYuqotish(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/66");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleQayguYili(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/65");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleOsha(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/64");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handletemirchi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/63");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHaqqiBormi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/62");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSuyaklar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/61");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMusovaHizr(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/60");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleAsxobiKahf(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/59");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYakkamaYakkaOlishuv(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/58");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleDuoQabulEtildi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/57");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleIstaklar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/56");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBuyukmujiza(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/55");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHAqliBulish(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/54");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYanaHabashiston(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/53");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTaklif(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/52");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHabashiston(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/51");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMaxsusBirDuo(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/50");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleVIjdonAzobi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/49");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleVahiyning(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/48");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleUlimdanKeyingaDoir(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/47");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage ahandle19malak(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/46");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHOojilarganimadeymiz(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/45");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleAfsona(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/44");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleEsliqariya(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/43");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleabujahl(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/42");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYosizOilasi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/41");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBilol(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/40");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleNIzovaQiynoqlar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/39");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleOchiqDavat(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/38");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleOydinliklar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/37");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handlekutilganTong(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/36");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleUkozBozori(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/35");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleHaqDinyulida(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/34");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYahudiyOlimlari(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/33");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleYanaSalmon(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/32");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleKabaHakamligi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/31");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleDardliOta(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/30");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleKichkinaMahbus(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/29");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleJasurBola(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/28");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handlenikoh(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/27");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSavdoKArvoni(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/21");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleForsiy(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/20");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleAhdlashuv(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/19");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleFijor(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/18");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleArslonBolasi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/17");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBulutlar(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/16");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSuiqast(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/15");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleShomsafari(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/14");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleBulutlarga(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/13");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleXonadonida(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/12");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handledarxtiningQulashi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/11");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleyuzQurbon(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/10");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleZamzam(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/9");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMehrquchogi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/8");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleMozor(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/7");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleSadyurtida(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/6");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleNabaviy(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/5");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleyiqiladimi2(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/4");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleyiqiladimi(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/3");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handlemuqaddima(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("https://t.me/Saodat_asri_qissalari_Ahmad_L/2");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        return sendMessage;
    }

    private SendMessage handleTurtinchiKitob(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Audioni tanlang!\uD83D\uDE0A \uD83D\uDC47");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        KeyboardRow first = new KeyboardRow();
        KeyboardRow second = new KeyboardRow();
        KeyboardRow three = new KeyboardRow();
        KeyboardRow four = new KeyboardRow();
        KeyboardRow five = new KeyboardRow();
        KeyboardRow six = new KeyboardRow();
        KeyboardRow seven = new KeyboardRow();
        KeyboardRow eight = new KeyboardRow();
        KeyboardRow nine = new KeyboardRow();
        KeyboardRow ten = new KeyboardRow();
        KeyboardRow elevn = new KeyboardRow();
        KeyboardRow twelve = new KeyboardRow();
        KeyboardRow thirtteen = new KeyboardRow();
        KeyboardRow fourteen = new KeyboardRow();
        KeyboardRow fiveteen = new KeyboardRow();
        KeyboardRow sixteen = new KeyboardRow();
        KeyboardRow seventeen = new KeyboardRow();
        KeyboardRow eightteen = new KeyboardRow();
        KeyboardRow nineteen = new KeyboardRow();
        KeyboardRow twenty = new KeyboardRow();
        KeyboardRow twentyone = new KeyboardRow();
        KeyboardRow twentytwoo = new KeyboardRow();
        KeyboardRow twentythree = new KeyboardRow();
        KeyboardRow twentyfour = new KeyboardRow();
        KeyboardRow twentyfive = new KeyboardRow();
        KeyboardRow unolti = new KeyboardRow();
        KeyboardRow unYetti = new KeyboardRow();
        KeyboardRow unsakkiz = new KeyboardRow();

        KeyboardButton xola = new KeyboardButton();
        xola.setText("150-qism Xolaning kelishi");
        KeyboardButton xansa = new KeyboardButton();
        xansa.setText("151-qism Xansa");
        KeyboardButton qoldirilganUmra = new KeyboardButton();
        qoldirilganUmra.setText("152-qism Qoldirilgan Umra");
        KeyboardButton xoliInbValid = new KeyboardButton();
        xoliInbValid.setText("153-qism Holid Ibn Validning Islomni qabul etishi");
        KeyboardButton tamim = new KeyboardButton();
        tamim.setText("154-qism Tamim qabilasi va Aqro");
        KeyboardButton sulaymQabilasi = new KeyboardButton();
        sulaymQabilasi.setText("155-qism Sulaym qabilasi");
        KeyboardButton tovoqningSinishi = new KeyboardButton();
        tovoqningSinishi.setText("156-qism Tovoqning sinishi");
        KeyboardButton salosilgazoti = new KeyboardButton();
        salosilgazoti.setText("157-qism Zotus Salosil g'azoti");
        KeyboardButton sayfulbahr = new KeyboardButton();
        sayfulbahr.setText("158-qism Sayful Bahr (Jayhush Habat) g'azoti");
        KeyboardButton muta1 = new KeyboardButton();
        muta1.setText("159-qism Mu'ta jangi");
        KeyboardButton muta2 = new KeyboardButton();
        muta2.setText("160-qism Mu'ta jangi 2");
        KeyboardButton HazratUmarningugiti = new KeyboardButton();
        HazratUmarningugiti.setText("161-qism Hazrati Umarning o'giti");
        KeyboardButton makkaFathi = new KeyboardButton();
        makkaFathi.setText("162-qism Makka fathi");
        KeyboardButton ashulachiXotin = new KeyboardButton();
        ashulachiXotin.setText("163-qism Makka fathi ashulachi xotin");
        KeyboardButton makkaFathiAbusufyon = new KeyboardButton();
        makkaFathiAbusufyon.setText("164-qism Makka fathi Abu Sufyon va sheriklari");
        KeyboardButton makkagaKirish = new KeyboardButton();
        makkagaKirish.setText("165-qism Makkaga kirish");
        KeyboardButton fathxutbasi = new KeyboardButton();
        fathxutbasi.setText("166 qism Fath xutbasi");
        KeyboardButton bayatmarosimi1 = new KeyboardButton();
        bayatmarosimi1.setText("167-qism Bayʼat marosimi");
        KeyboardButton bayatmarosimi2 = new KeyboardButton();
        bayatmarosimi2.setText("168 bu-qism Bayʼat marosimi 2");
        KeyboardButton hunaynqamali1 = new KeyboardButton();
        hunaynqamali1.setText("169-qism Hunayn qamali");
        KeyboardButton hunaynqamali2 = new KeyboardButton();
        hunaynqamali2.setText("170-qism Hunayn qamali 2");
        KeyboardButton hunaynqamali3 = new KeyboardButton();
        hunaynqamali3.setText("171-qism Hunayn qamali 3");
        KeyboardButton hunaynqamali4 = new KeyboardButton();
        hunaynqamali4.setText("172-qism Hunayn qamali 4");
        KeyboardButton xuroqa = new KeyboardButton();
        xuroqa.setText("173-qism  Xuroqa safari");
        KeyboardButton kichikMehmon = new KeyboardButton();
        kichikMehmon.setText("174-qism Kichik mehmon");
        KeyboardButton ikkimozor = new KeyboardButton();
        ikkimozor.setText("175-qism  Ikki mozor");
        KeyboardButton zaynabningvafoti = new KeyboardButton();
        zaynabningvafoti.setText("176-qism  Hazrati Zaynabning vafoti");
        KeyboardButton hilolibnumayya = new KeyboardButton();
        hilolibnumayya.setText("177-qism  Hilol ibn Umayya");
        KeyboardButton shoirningulimi = new KeyboardButton();
        shoirningulimi.setText("178-qism Bir shoirning oʻlimi");
        KeyboardButton hajAmri = new KeyboardButton();
        hajAmri.setText("179-Islomning ilk haj amri");
        KeyboardButton iloHodisasi = new KeyboardButton();
        iloHodisasi.setText("180-qism Ilo hodisasi");
        KeyboardButton sutZiyofat = new KeyboardButton();
        sutZiyofat.setText("181-qism  Sut ziyofat");
        KeyboardButton asadqabilasi = new KeyboardButton();
        asadqabilasi.setText("182-qism Asad qabilasi");
        KeyboardButton qasidaiBurda = new KeyboardButton();
        qasidaiBurda.setText("183-qism  Kaʼb ibn Zuhayr va Qasidai burda");
        KeyboardButton habashSultoni = new KeyboardButton();
        habashSultoni.setText("184-qism Habash sultoni Najoshiy");
        KeyboardButton saqifhayati = new KeyboardButton();
        saqifhayati.setText("185-qism Saqif hayʼati");
        KeyboardButton biryosh = new KeyboardButton();
        biryosh.setText("186-qism Yaxshi uylangan bir yosh");
        KeyboardButton qabristonZiyofati = new KeyboardButton();
        qabristonZiyofati.setText("187-qism Qabriston ziyorati");
        KeyboardButton najronliklar = new KeyboardButton();
        najronliklar.setText("188-qism Najronliklar");
        KeyboardButton tabuksafari1 = new KeyboardButton();
        tabuksafari1.setText("189-qism Tabuk safari");
        KeyboardButton tabuksafari2 = new KeyboardButton();
        tabuksafari2.setText("190-qism  Tabuk safari 2");
        KeyboardButton tabuksafari3 = new KeyboardButton();
        tabuksafari3.setText("191-qism Tabuk safari 3");
        KeyboardButton tabuksafari4 = new KeyboardButton();
        tabuksafari4.setText("192-qism Tabuk safari 4");
        KeyboardButton tabuksafari5 = new KeyboardButton();
        tabuksafari5.setText("193-qism Tabuk safari 5");
        KeyboardButton ziyoratchi = new KeyboardButton();
        ziyoratchi.setText("194-qism  E'tirof payti kelgan ziyoratchi");
        KeyboardButton safardanxotira = new KeyboardButton();
        safardanxotira.setText("195-qism Bir safardan xotira");
        KeyboardButton ibrohimningvafoti = new KeyboardButton();
        ibrohimningvafoti.setText("196-qism Ibrohimning vafoti");
        KeyboardButton musaylama = new KeyboardButton();
        musaylama.setText("197-qism  Yolgʻonchi Musaylama");
        KeyboardButton RasulullohsevganOdam = new KeyboardButton();
        RasulullohsevganOdam.setText("198-qism Rosululloh sevgan odam");
        KeyboardButton vidohaji1 = new KeyboardButton();
        vidohaji1.setText("199-qism Vido haji");
        KeyboardButton vidohaji2 = new KeyboardButton();
        vidohaji2.setText("200-qism Vido haji 2");
        KeyboardButton vidohaji3 = new KeyboardButton();
        vidohaji3.setText("201-qism Vido haji 3");
        KeyboardButton vafotlari1 = new KeyboardButton();
        vafotlari1.setText("202-qism Paygʻambarimiz (s.a.v) vafotlari 1-qism");
        KeyboardButton vafotlari2 = new KeyboardButton();
        vafotlari2.setText("203-qism Paygʻambarimiz (s.a.v) vafotlar 2-qism");
        KeyboardButton vafotlari3 = new KeyboardButton();
        vafotlari3.setText("204-qism Paygʻambarimiz (s.a.v) vafotlari 3-qism");
        KeyboardButton backButton = new KeyboardButton();
        backButton.setText("Ortga qaytish↪");

        first.add(xola);//150
        first.add(xansa);//151
        second.add(qoldirilganUmra);//152
        second.add(xoliInbValid);//153
        three.add(tamim);//154
        three.add(sulaymQabilasi);//155
        four.add(tovoqningSinishi);//156
        four.add(salosilgazoti);//157
        five.add(sayfulbahr);//158
        five.add(muta1);//159
        six.add(muta2);//160
        six.add(HazratUmarningugiti);//161
        seven.add(makkaFathi);//162
        seven.add(ashulachiXotin);//163
        eight.add(makkaFathiAbusufyon);//164
        eight.add(makkagaKirish);//165
        nine.add(fathxutbasi);//166
        nine.add(bayatmarosimi1);//167
        ten.add(bayatmarosimi2);//168
        ten.add(hunaynqamali1);//169
        elevn.add(hunaynqamali2);//170
        elevn.add(hunaynqamali3);//171
        twelve.add(hunaynqamali4);//172
        twelve.add(xuroqa);//173
        thirtteen.add(kichikMehmon);//174
        thirtteen.add(ikkimozor);//175
        fourteen.add(zaynabningvafoti);  //176
        fourteen.add(hilolibnumayya);//177
        fiveteen.add(shoirningulimi);//178
        fiveteen.add(hajAmri);//179
        sixteen.add(iloHodisasi);//180
        sixteen.add(sutZiyofat);//181
        seventeen.add(asadqabilasi);//182
        seventeen.add(qasidaiBurda);//183
        eightteen.add(habashSultoni);//184
        eightteen.add(saqifhayati);//185
        nineteen.add(biryosh);//186
        nineteen.add(qabristonZiyofati);//187
        twenty.add(najronliklar);//188
        twenty.add(tabuksafari1);//189
        twentyone.add(tabuksafari2);//190
        twentyone.add(tabuksafari3);//191
        twentytwoo.add(tabuksafari4);//192
        twentytwoo.add(tabuksafari5);//193
        twentythree.add(ziyoratchi);//194
        twentythree.add(safardanxotira);//195
        twentyfour.add(ibrohimningvafoti);//196
        twentyfour.add(musaylama);//197
        twentyfive.add(RasulullohsevganOdam);//198
        twentyfive.add(vidohaji1);//199
        unolti.add(vidohaji2);//200
        unolti.add(vidohaji3);//201
        unYetti.add(vafotlari1);//202
        unYetti.add(vafotlari2);//203
        unsakkiz.add(vafotlari3);//204
        unsakkiz.add(backButton);//140

        List<KeyboardRow> rowList = new ArrayList<>();

        rowList.add(first);
        rowList.add(second);
        rowList.add(three);
        rowList.add(four);
        rowList.add(five);
        rowList.add(six);
        rowList.add(seven);
        rowList.add(eight);
        rowList.add(nine);
        rowList.add(ten);
        rowList.add(elevn);
        rowList.add(twelve);
        rowList.add(thirtteen);
        rowList.add(fourteen);
        rowList.add(fiveteen);
        rowList.add(sixteen);
        rowList.add(seventeen);
        rowList.add(eightteen);
        rowList.add(nineteen);
        rowList.add(twenty);
        rowList.add(twentyone);
        rowList.add(twentytwoo);
        rowList.add(twentythree);
        rowList.add(twentyfour);
        rowList.add(twentyfive);
        rowList.add(unolti);
        rowList.add(unYetti);
        rowList.add(unsakkiz);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    private SendMessage handleUchunchiKitob(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Audioni tanlang!\uD83D\uDE0A \uD83D\uDC47");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        KeyboardRow first = new KeyboardRow();
        KeyboardRow second = new KeyboardRow();
        KeyboardRow three = new KeyboardRow();
        KeyboardRow four = new KeyboardRow();
        KeyboardRow five = new KeyboardRow();
        KeyboardRow six = new KeyboardRow();
        KeyboardRow seven = new KeyboardRow();
        KeyboardRow eight = new KeyboardRow();
        KeyboardRow nine = new KeyboardRow();
        KeyboardRow ten = new KeyboardRow();
        KeyboardRow elevn = new KeyboardRow();
        KeyboardRow twelve = new KeyboardRow();
        KeyboardRow thirtteen = new KeyboardRow();
        KeyboardRow fourteen = new KeyboardRow();
        KeyboardRow fiveteen = new KeyboardRow();
        KeyboardRow sixteen = new KeyboardRow();
        KeyboardRow seventeen = new KeyboardRow();
        KeyboardRow eightteen = new KeyboardRow();
        KeyboardRow nineteen = new KeyboardRow();
        KeyboardRow twenty = new KeyboardRow();
        KeyboardRow twentyone = new KeyboardRow();
        KeyboardRow twentytwoo = new KeyboardRow();
        KeyboardRow twentythree = new KeyboardRow();
        KeyboardRow twentyfour = new KeyboardRow();
        KeyboardRow twentyfive = new KeyboardRow();
        KeyboardRow unolti = new KeyboardRow();
        KeyboardRow unYetti = new KeyboardRow();
        KeyboardRow unsakkiz = new KeyboardRow();
        KeyboardRow untuqqiz = new KeyboardRow();
        KeyboardRow yigirma = new KeyboardRow();
        KeyboardRow yigirmaBir = new KeyboardRow();
        KeyboardRow yigirmaIkki = new KeyboardRow();
        KeyboardRow yigirmauch = new KeyboardRow();


        KeyboardButton badrintiqomi1 = new KeyboardButton();
        badrintiqomi1.setText("85-qism Badr intiqomi uchun qasam (1-qism)");
        KeyboardButton badrintiqomi2 = new KeyboardButton();
        badrintiqomi2.setText("86-qism Badr intiqomi uchun qasam (2-qism)");
        KeyboardButton badrintiqomi3 = new KeyboardButton();
        badrintiqomi3.setText("87-qism Badr intiqomi uchun qasam (3-qism)");
        KeyboardButton badrintiqomi4 = new KeyboardButton();
        badrintiqomi4.setText("88-qism Badr intiqomi uchun qasam (4-qism)");
        KeyboardButton badrintiqomi5 = new KeyboardButton();
        badrintiqomi5.setText("89-qism Badr intiqomi uchun qasam (5-qism)");
        KeyboardButton badrintiqomi6 = new KeyboardButton();
        badrintiqomi6.setText("90-qism Badr intiqomi uchun qasam (6-qism)");
        KeyboardButton badrintiqomi7 = new KeyboardButton();
        badrintiqomi7.setText("91-qism Badr intiqomi uchun qasam (7-qism)");
        KeyboardButton badrintiqomi8 = new KeyboardButton();
        badrintiqomi8.setText("92-qism Badr intiqomi uchun qasam (8-qism)");
        KeyboardButton badrintiqomi9 = new KeyboardButton();
        badrintiqomi9.setText("93-qism Badr intiqomi uchun qasam (9-qism)");
        KeyboardButton badrintiqomi10 = new KeyboardButton();
        badrintiqomi10.setText("94-qism Badr intiqomi uchun qasam (10-qism)");
        KeyboardButton badrintiqomi11 = new KeyboardButton();
        badrintiqomi11.setText("95-qism Badr intiqomi uchun qasam (11-qism)");
        KeyboardButton badrintiqomi12 = new KeyboardButton();
        badrintiqomi12.setText("96-qism Badr intiqomi uchun qasam (12-qism)");
        KeyboardButton topshiriq = new KeyboardButton();
        topshiriq.setText("97-qism Uhud jangi Amakidan olingan maktub");
        KeyboardButton jangdanBirKun = new KeyboardButton();
        jangdanBirKun.setText("98-qism Jangdan bir kun burun");
        KeyboardButton uhut = new KeyboardButton();
        uhut.setText("99-qism Uhut tog`i sari");
        KeyboardButton yakkamYakka = new KeyboardButton();
        yakkamYakka.setText("100-qism Yakkama-yakka olishuvlar");
        KeyboardButton shahid = new KeyboardButton();
        shahid.setText("101-qism Shahidlar ulug`i hazrati Hamza");
        KeyboardButton shahid1 = new KeyboardButton();
        shahid1.setText("102-qism Shahidlar ulug`i hazrati Hamza (2-qism)");
        KeyboardButton abusufyon = new KeyboardButton();
        abusufyon.setText("103-qism Abu Sufyon va Hazrati Hamza");
        KeyboardButton badrda = new KeyboardButton();
        badrda.setText("104-qism Bir yildan keyin Badrda uchrashamiz");
        KeyboardButton uhutdanQaytish = new KeyboardButton();
        uhutdanQaytish.setText("105-qism Uhutdan qaytish");
        KeyboardButton taqib = new KeyboardButton();
        taqib.setText("106-qism Taqib Hamroul Asad safari");
        KeyboardButton qiymatlari = new KeyboardButton();
        qiymatlari.setText("107-qism Buyuk Mavloning Uhutga bergan qiymatlari");
        KeyboardButton xushxabar = new KeyboardButton();
        xushxabar.setText("108-qism Makkaga Hush xabar");
        KeyboardButton berilganDars = new KeyboardButton();
        berilganDars.setText("109-qism Asad o`g`illariga berilgan dars");
        KeyboardButton xiyonat = new KeyboardButton();
        xiyonat.setText("110-qism Raji arig`i yonidagi xiyonat");
        KeyboardButton asir = new KeyboardButton();
        asir.setText("111-qism Ikki asir");
        KeyboardButton tuzogi = new KeyboardButton();
        tuzogi.setText("112-qism Yahudiylar tuzog`i");
        KeyboardButton tozalaganAyol = new KeyboardButton();
        tozalaganAyol.setText("113-qism Allohning Uyini tozalagan ayol");
        KeyboardButton miskinlarOnasi = new KeyboardButton();
        miskinlarOnasi.setText("114-qism Miskinlarning onasi Hazrati Zaynabning vafoti");
        KeyboardButton gazoti = new KeyboardButton();
        gazoti.setText("115-qism Zotur Riqo G`azoti va Jobir");
        KeyboardButton mehmondorchilik = new KeyboardButton();
        mehmondorchilik.setText("116-qism Ichkilikli Mehmondorchilik");
        KeyboardButton badr = new KeyboardButton();
        badr.setText("117-qism Ikkinchi Badr");
        KeyboardButton nikoh = new KeyboardButton();
        nikoh.setText("118-qism Havas bilan boshlanib mahzunlik bilan tugagan nikoh");
        KeyboardButton handaq = new KeyboardButton();
        handaq.setText("119-qism Handaq Jangi");
        KeyboardButton handaqQazilmoqda = new KeyboardButton();
        handaqQazilmoqda.setText("120-qism Handaq qazilmoqda");
        KeyboardButton ziyofat = new KeyboardButton();
        ziyofat.setText("121-qism Barokatli bir ziyofat");
        KeyboardButton xiyonat1 = new KeyboardButton();
        xiyonat1.setText("122-qism Xiyonat");
        KeyboardButton abdivadd = new KeyboardButton();
        abdivadd.setText("123-qism Amr Ibn Abdi Vadd");
        KeyboardButton taaruz = new KeyboardButton();
        taaruz.setText("124-qism Umumiy Taaruz");
        KeyboardButton qurayza = new KeyboardButton();
        qurayza.setText("125-qism Qurayza Yahudiylari sari");
        KeyboardButton pushaymonOdam = new KeyboardButton();
        pushaymonOdam.setText("126-Pushaymon Odam");
        KeyboardButton birMahbub = new KeyboardButton();
        birMahbub.setText("127-qism Robbiga qovushgan bir Mahbub");
        KeyboardButton zaynab = new KeyboardButton();
        zaynab.setText("128-qism Zaynab Xonim");
        KeyboardButton xolidIbnSufyon = new KeyboardButton();
        xolidIbnSufyon.setText("129-qism Xolid ibn Sufyon");
        KeyboardButton ichkilik = new KeyboardButton();
        ichkilik.setText("130-qism Yana bir ichkilikli yig`in");
        KeyboardButton qoradhodisasi = new KeyboardButton();
        qoradhodisasi.setText("131-qism Zu qorad hodisasi");
        KeyboardButton AvsInbSomit = new KeyboardButton();
        AvsInbSomit.setText("132-qism Avs Ibn Somit");
        KeyboardButton quronuqimoqda = new KeyboardButton();
        quronuqimoqda.setText("133-qism Ibn Mas'ud Qur'on o'qimoqda");
        KeyboardButton mustali = new KeyboardButton();
        mustali.setText("134-qism Bani Mustaliq safari");
        KeyboardButton marjon = new KeyboardButton();
        marjon.setText("135-qism Yo'qolgan marjon hodisasi");
        KeyboardButton oydinlashtirish = new KeyboardButton();
        oydinlashtirish.setText("136-qism Hodisani oydinlashtirish");
        KeyboardButton vahiyKeltirganOydinlik = new KeyboardButton();
        vahiyKeltirganOydinlik.setText("137-qism Vahiy keltirgan oydinlik");
        KeyboardButton tush = new KeyboardButton();
        tush.setText("138-qism Tush chinga aylanayotir");
        KeyboardButton huzayma = new KeyboardButton();
        huzayma.setText("139-qism Huzayma guvoh bo'ldi");
        KeyboardButton hudaybiya = new KeyboardButton();
        hudaybiya.setText("140-qism Hudaybiya");
        KeyboardButton hudaybiya1 = new KeyboardButton();
        hudaybiya1.setText("141-qism Hudaybiya-1");
        KeyboardButton hudaybiya2 = new KeyboardButton();
        hudaybiya2.setText("142-qism Hudaybiya-2");
        KeyboardButton ummuHabiba = new KeyboardButton();
        ummuHabiba.setText("143-qism Ummu Habiba Roziyallohu anho");
        KeyboardButton haybar = new KeyboardButton();
        haybar.setText("144-qism Haybar");
        KeyboardButton haybar1 = new KeyboardButton();
        haybar1.setText("145-qism Haybar-2");
        KeyboardButton haybar2 = new KeyboardButton();
        haybar2.setText("146-qism Haybar-3");
        KeyboardButton haybar3 = new KeyboardButton();
        haybar3.setText("147-qism Haybar-4");
        KeyboardButton heraklgaMaktub = new KeyboardButton();
        heraklgaMaktub.setText("148-qism Heraklga maktub");
        KeyboardButton muvoqisgaMaktub = new KeyboardButton();
        muvoqisgaMaktub.setText("149-qism Muvoqisga maktub");
        KeyboardButton backButton = new KeyboardButton();
        backButton.setText("Ortga qaytish↪");

        first.add(badrintiqomi1);//85
        first.add(badrintiqomi2);//86
        second.add(badrintiqomi3);//87
        second.add(badrintiqomi4);//88
        three.add(badrintiqomi5);//89
        three.add(badrintiqomi6);//90
        four.add(badrintiqomi7);//91
        four.add(badrintiqomi8);//92
        five.add(badrintiqomi9);//93
        five.add(badrintiqomi10);//94
        six.add(badrintiqomi11);//95
        six.add(badrintiqomi12);//96
        seven.add(topshiriq);//97
        seven.add(jangdanBirKun);//98
        eight.add(uhut);//99
        eight.add(yakkamYakka);//100
        nine.add(shahid);//101
        nine.add(shahid1);//102
        ten.add(abusufyon);//103
        ten.add(badrda);//104
        elevn.add(uhutdanQaytish);//105
        elevn.add(taqib);//106
        twelve.add(qiymatlari);//107
        twelve.add(xushxabar);//108
        thirtteen.add(berilganDars);//109
        thirtteen.add(xiyonat);//110
        fourteen.add(asir);  //111
        fourteen.add(tuzogi);//112
        fiveteen.add(tozalaganAyol);//113
        fiveteen.add(miskinlarOnasi);//114
        sixteen.add(gazoti);//115
        sixteen.add(mehmondorchilik);//116
        seventeen.add(badr);//117
        seventeen.add(nikoh);//118
        eightteen.add(handaq);//119
        eightteen.add(handaqQazilmoqda);//120
        nineteen.add(ziyofat);//121
        nineteen.add(xiyonat1);//122
        twenty.add(abdivadd);//123
        twenty.add(taaruz);//124
        twentyone.add(qurayza);//125
        twentyone.add(pushaymonOdam);//126
        twentytwoo.add(birMahbub);//127
        twentytwoo.add(zaynab);//128
        twentythree.add(xolidIbnSufyon);//129
        twentythree.add(ichkilik);//130
        twentyfour.add(qoradhodisasi);//131
        twentyfour.add(AvsInbSomit);//132
        twentyfive.add(quronuqimoqda);//133
        twentyfive.add(mustali);//134
        unolti.add(marjon);//135
        unolti.add(oydinlashtirish);//136
        unYetti.add(vahiyKeltirganOydinlik);//137
        unYetti.add(tush);//138
        unsakkiz.add(huzayma);//139
        unsakkiz.add(hudaybiya);//140
        untuqqiz.add(hudaybiya1);//141
        untuqqiz.add(hudaybiya2);//142
        yigirma.add(ummuHabiba);
        yigirma.add(haybar);
        yigirmaBir.add(haybar1);
        yigirmaBir.add(haybar2);
        yigirmaIkki.add(haybar3);
        yigirmaIkki.add(heraklgaMaktub);
        yigirmauch.add(muvoqisgaMaktub);
        yigirmauch.add(backButton);

        List<KeyboardRow> rowList = new ArrayList<>();

        rowList.add(first);
        rowList.add(second);
        rowList.add(three);
        rowList.add(four);
        rowList.add(five);
        rowList.add(six);
        rowList.add(seven);
        rowList.add(eight);
        rowList.add(nine);
        rowList.add(ten);
        rowList.add(elevn);
        rowList.add(twelve);
        rowList.add(thirtteen);
        rowList.add(fourteen);
        rowList.add(fiveteen);
        rowList.add(sixteen);
        rowList.add(seventeen);
        rowList.add(eightteen);
        rowList.add(nineteen);
        rowList.add(twenty);
        rowList.add(twentyone);
        rowList.add(twentytwoo);
        rowList.add(twentythree);
        rowList.add(twentyfour);
        rowList.add(twentyfive);
        rowList.add(unolti);
        rowList.add(unYetti);
        rowList.add(unsakkiz);
        rowList.add(untuqqiz);
        rowList.add(yigirma);
        rowList.add(yigirmaBir);
        rowList.add(yigirmaIkki);
        rowList.add(yigirmauch);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;

    }

    private SendMessage handleIkkinchiKitob(Message message) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Audioni tanlang!\uD83D\uDE0A \uD83D\uDC47");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        KeyboardRow first = new KeyboardRow();
        KeyboardRow second = new KeyboardRow();
        KeyboardRow three = new KeyboardRow();
        KeyboardRow four = new KeyboardRow();
        KeyboardRow five = new KeyboardRow();
        KeyboardRow six = new KeyboardRow();
        KeyboardRow seven = new KeyboardRow();
        KeyboardRow eight = new KeyboardRow();
        KeyboardRow nine = new KeyboardRow();
        KeyboardRow ten = new KeyboardRow();
        KeyboardRow elevn = new KeyboardRow();
        KeyboardRow twelve = new KeyboardRow();
        KeyboardRow thirtteen = new KeyboardRow();
        KeyboardRow fourteen = new KeyboardRow();
        KeyboardRow fiveteen = new KeyboardRow();
        KeyboardRow sixteen = new KeyboardRow();
        KeyboardRow seventeen = new KeyboardRow();
        KeyboardRow eightteen = new KeyboardRow();
        KeyboardRow nineteen = new KeyboardRow();
        KeyboardRow twenty = new KeyboardRow();
        KeyboardRow twentyone = new KeyboardRow();
        KeyboardRow twentytwoo = new KeyboardRow();
        KeyboardRow twentythree = new KeyboardRow();
        KeyboardRow twentyfour = new KeyboardRow();
        KeyboardRow twentyfive = new KeyboardRow();

        KeyboardButton buyukmujiza = new KeyboardButton();
        buyukmujiza.setText("49-qism Buyuk mo'jiza");
        KeyboardButton garazliIstak = new KeyboardButton();
        garazliIstak.setText("50-qism G'arazli istaklar");
        KeyboardButton duoQabulEtildi = new KeyboardButton();
        duoQabulEtildi.setText("51-qism Duo qabul etildi");
        KeyboardButton yakkaOlishuv = new KeyboardButton();
        yakkaOlishuv.setText("52-qism Yakkama-yakka olishuv");
        KeyboardButton kahf = new KeyboardButton();
        kahf.setText("53-qism Asxobi Kahf");
        KeyboardButton Muso = new KeyboardButton();
        Muso.setText("54-qism Hazrati Muso va Hizir");
        KeyboardButton chiriganSuyaklar = new KeyboardButton();
        chiriganSuyaklar.setText("55-qism Chirigan suyaklar");
        KeyboardButton haqqiBormi = new KeyboardButton();
        haqqiBormi.setText("56-qism Mo'minning yashashga haqqi bormi?");
        KeyboardButton temirchi = new KeyboardButton();
        temirchi.setText("57-qism Til bilmas temirchi");
        KeyboardButton osha = new KeyboardButton();
        osha.setText("58-qism Mashhur shoir Osha qanday aldandi?");
        KeyboardButton qayguYili = new KeyboardButton();
        qayguYili.setText("59-qism Qayg'u yili");
        KeyboardButton yuqotish = new KeyboardButton();
        yuqotish.setText("60-qism Yana bir mislsiz yo'qotish");
        KeyboardButton Toifsafari = new KeyboardButton();
        Toifsafari.setText("61-qism Toif safari");
        KeyboardButton Meroj = new KeyboardButton();
        Meroj.setText("62-qism Buyuk da'vat va tasalli (Meroj)");
        KeyboardButton bozorlarda = new KeyboardButton();
        bozorlarda.setText("63-qism Bozorlarda qilingan da'vat");
        KeyboardButton yasrib = new KeyboardButton();
        yasrib.setText("64-qism Yasrib imon qarorgohiga aylanadi");
        KeyboardButton YasribgaHijrat = new KeyboardButton();
        YasribgaHijrat.setText("65-qism Iymon yurti Yasribga hijrat");
        KeyboardButton buyukUmar = new KeyboardButton();
        buyukUmar.setText("66-qism Buyuk Umarning Makkani tark etishi");
        KeyboardButton suiqastqarori = new KeyboardButton();
        suiqastqarori.setText("67-qism Suiqasd qarori");
        KeyboardButton gordanChiqish = new KeyboardButton();
        gordanChiqish.setText("68-qism G'ordan chiqish");
        KeyboardButton yasribdaMujda = new KeyboardButton();
        yasribdaMujda.setText("69-qism Yasribda mujda saslari");
        KeyboardButton ilkJUma = new KeyboardButton();
        ilkJUma.setText("70-qism Yasribga harakat. Ilk juma namozi");
        KeyboardButton hijratYurti = new KeyboardButton();
        hijratYurti.setText("71-qism Hijrat yurtida zafarlar (1-qism)");
        KeyboardButton hijratYurti2 = new KeyboardButton();
        hijratYurti2.setText("72-qism Hijrat yurtida zafarlar (2-qism)");
        KeyboardButton hijratYurti3 = new KeyboardButton();
        hijratYurti3.setText("73-qism Hijrat yurtida zafarlar (3-qism)");
        KeyboardButton hijratYurti4 = new KeyboardButton();
        hijratYurti4.setText("74-qism Hijrat yurtida zafarlar (4-qism)");
        KeyboardButton hijratYurti5 = new KeyboardButton();
        hijratYurti5.setText("75-qism Hijrat yurtida zafarlar (5-qism)");
        KeyboardButton hijratYurti6 = new KeyboardButton();
        hijratYurti6.setText("76-qism Hijrat yurtida zafarlar (6-qism)");
        KeyboardButton hijratYurti7 = new KeyboardButton();
        hijratYurti7.setText("77-qism Hijrat yurtida zafarlar (7-qism)");
        KeyboardButton hijratYurti8 = new KeyboardButton();
        hijratYurti8.setText("78-qism Hijrat yurtida zafarlar (8-qism)");
        KeyboardButton ikkiQiblaliMasjid = new KeyboardButton();
        ikkiQiblaliMasjid.setText("79-qism Ikki qiblali masjid");
        KeyboardButton ikkiQiblaliMasjid2 = new KeyboardButton();
        ikkiQiblaliMasjid2.setText("80-qism Ikki qiblali masjid (2-qism)");
        KeyboardButton ikkiQiblali = new KeyboardButton();
        ikkiQiblali.setText("81-qism. IKKI QIBLALI MASJID-3");
        KeyboardButton ikkiQiblali2 = new KeyboardButton();
        ikkiQiblali2.setText("82-qism. IKKI QIBLALI MASJID-4");
        KeyboardButton ikkiQiblali3 = new KeyboardButton();
        ikkiQiblali3.setText("83-qism. IKKI QIBLALI MASJID-5");
        KeyboardButton ikkiQiblali4 = new KeyboardButton();
        ikkiQiblali4.setText("84-qism. IKKI QIBLALI MASJID-6");
        KeyboardButton backButton = new KeyboardButton();
        backButton.setText("Ortga qaytish↪");

        first.add(buyukmujiza);
        first.add(garazliIstak);
        second.add(duoQabulEtildi);
        second.add(yakkaOlishuv);
        three.add(kahf);
        three.add(Muso);
        four.add(chiriganSuyaklar);
        four.add(haqqiBormi);
        five.add(temirchi);
        five.add(osha);
        six.add(qayguYili);
        six.add(yuqotish);
        seven.add(Toifsafari);
        seven.add(Meroj);
        eight.add(bozorlarda);
        eight.add(yasrib);
        nine.add(YasribgaHijrat);
        nine.add(buyukUmar);
        ten.add(suiqastqarori);
        ten.add(gordanChiqish);
        elevn.add(yasribdaMujda);
        elevn.add(ilkJUma);
        twelve.add(hijratYurti);
        twelve.add(hijratYurti2);
        thirtteen.add(hijratYurti3);
        thirtteen.add(hijratYurti4);
        fourteen.add(hijratYurti5);
        fourteen.add(hijratYurti6);
        fiveteen.add(hijratYurti7);
        fiveteen.add(hijratYurti8);
        sixteen.add(ikkiQiblaliMasjid);
        sixteen.add(ikkiQiblaliMasjid2);
        seventeen.add(ikkiQiblali);
        seventeen.add(ikkiQiblali2);
        eightteen.add(ikkiQiblali3);
        eightteen.add(ikkiQiblali4);
        nineteen.add(backButton);

        List<KeyboardRow> rowList = new ArrayList<>();

        rowList.add(first);
        rowList.add(second);
        rowList.add(three);
        rowList.add(four);
        rowList.add(five);
        rowList.add(six);
        rowList.add(seven);
        rowList.add(eight);
        rowList.add(nine);
        rowList.add(ten);
        rowList.add(elevn);
        rowList.add(twelve);
        rowList.add(thirtteen);
        rowList.add(fourteen);
        rowList.add(fiveteen);
        rowList.add(sixteen);
        rowList.add(seventeen);
        rowList.add(eightteen);
        rowList.add(nineteen);
        rowList.add(twentyone);


        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }


    private SendMessage handleBirinchiKitob(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Audioni tanlang!\uD83D\uDE0A \uD83D\uDC47");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();

        KeyboardRow first = new KeyboardRow();
        KeyboardRow second = new KeyboardRow();
        KeyboardRow three = new KeyboardRow();
        KeyboardRow four = new KeyboardRow();
        KeyboardRow five = new KeyboardRow();
        KeyboardRow six = new KeyboardRow();
        KeyboardRow seven = new KeyboardRow();
        KeyboardRow eight = new KeyboardRow();
        KeyboardRow nine = new KeyboardRow();
        KeyboardRow ten = new KeyboardRow();
        KeyboardRow elevn = new KeyboardRow();
        KeyboardRow twelve = new KeyboardRow();
        KeyboardRow thirtteen = new KeyboardRow();
        KeyboardRow fourteen = new KeyboardRow();
        KeyboardRow fiveteen = new KeyboardRow();
        KeyboardRow sixteen = new KeyboardRow();
        KeyboardRow seventeen = new KeyboardRow();
        KeyboardRow eightteen = new KeyboardRow();
        KeyboardRow nineteen = new KeyboardRow();
        KeyboardRow twenty = new KeyboardRow();
        KeyboardRow twentyone = new KeyboardRow();
        KeyboardRow twentytwoo = new KeyboardRow();
        KeyboardRow twentythree = new KeyboardRow();
        KeyboardRow twentyfour = new KeyboardRow();
        KeyboardRow twentyfive = new KeyboardRow();

        KeyboardButton muqaddima = new KeyboardButton();
        muqaddima.setText("1-qism Muqaddima");
        KeyboardButton kabayiqladimi = new KeyboardButton();
        kabayiqladimi.setText("2-qim Kaba yiqiladimi?");
        KeyboardButton kabayiqiladimi2 = new KeyboardButton();
        kabayiqiladimi2.setText("3-qism Kaba yiqiladimi 2");
        KeyboardButton mavlid = new KeyboardButton();
        mavlid.setText("4-qism Mavlidi Nabaviy");
        KeyboardButton sadYurtida = new KeyboardButton();
        sadYurtida.setText("5-qism Bani Sa'd yurtida");
        KeyboardButton abvoda = new KeyboardButton();
        abvoda.setText("6-qism Abvoda qazilgan mozor");
        KeyboardButton mehrQuchogi = new KeyboardButton();
        mehrQuchogi.setText("7-qism Abdulmuttalibning mehr quchog'i");
        KeyboardButton zamzam = new KeyboardButton();
        zamzam.setText("8-qism Zam Zam");
        KeyboardButton birQurbon = new KeyboardButton();
        birQurbon.setText("9-qism Bir qurbon-Yuz qurbon");
        KeyboardButton azimdaraxti = new KeyboardButton();
        azimdaraxti.setText("10 qism Azim darxtning qulashi");
        KeyboardButton abuTolib = new KeyboardButton();
        abuTolib.setText("11-qism Abu Tolibning xonadonida");
        KeyboardButton bulutlar = new KeyboardButton();
        bulutlar.setText("12-qism Bulutlarga qilingan ishora");
        KeyboardButton shomSafari = new KeyboardButton();
        shomSafari.setText("13-qism Shom safari");
        KeyboardButton suiqast = new KeyboardButton();
        suiqast.setText("14-qism Suiqasd qilishmoqchi");
        KeyboardButton bulutlarQoshida = new KeyboardButton();
        bulutlarQoshida.setText("15-qism Yana butlar qoshida");
        KeyboardButton arslonBolasi = new KeyboardButton();
        arslonBolasi.setText("16-qism Arslon bolasi");
        KeyboardButton fijor = new KeyboardButton();
        fijor.setText("17-qism Fijor urushi");
        KeyboardButton sharafliAhdlashuv = new KeyboardButton();
        sharafliAhdlashuv.setText("18-qism Sharafli ahdlashuv");
        KeyboardButton solmon = new KeyboardButton();
        solmon.setText("19-qism Salmon Forsiy");
        KeyboardButton savdoKarvon = new KeyboardButton();
        savdoKarvon.setText("20-qism Hadichaning savdo karvoni");
        KeyboardButton nikoh = new KeyboardButton();
        nikoh.setText("21-qism Baxtli nikoh");
        KeyboardButton jasurBirBola = new KeyboardButton();
        jasurBirBola.setText("22-qism Jasur bir bola");
        KeyboardButton mahbus = new KeyboardButton();
        mahbus.setText("23-qism Suyukli kichkina mahbus");
        KeyboardButton dardliOta = new KeyboardButton();
        dardliOta.setText("24-qism Dardli bir ota");
        KeyboardButton hakamli = new KeyboardButton();
        hakamli.setText("25-qism Ka'ba hakamligi");
        KeyboardButton yanaSolmon = new KeyboardButton();
        yanaSolmon.setText("26-qism Yana Salmon");
        KeyboardButton yahudiyOlimlar = new KeyboardButton();
        yahudiyOlimlar.setText("27-qism Yahudiy olimlari");
        KeyboardButton dinYulida = new KeyboardButton();
        dinYulida.setText("28-qism Haq din yo'lida");
        KeyboardButton ukozBozori = new KeyboardButton();
        ukozBozori.setText("29-qism Ukoz bozori");
        KeyboardButton kutilganTong = new KeyboardButton();
        kutilganTong.setText("30-qism Intizor kutilgan tong");
        KeyboardButton oydinliklarSari = new KeyboardButton();
        oydinliklarSari.setText("31-qism Oydinliklar sari");
        KeyboardButton ochiqdavat = new KeyboardButton();
        ochiqdavat.setText("32-qism Ochiq da'vat sari ilk odim");
        KeyboardButton nizo = new KeyboardButton();
        nizo.setText("33-qism Nizo va qiynoqlar");
        KeyboardButton Bilol = new KeyboardButton();
        Bilol.setText("34-qism Bilol Habashiy");
        KeyboardButton Yosir = new KeyboardButton();
        Yosir.setText("35-qism Yosir oilasi va Ammor");
        KeyboardButton abujahl = new KeyboardButton();
        abujahl.setText("36-qism Amr ibn Hishom Abu Jahl");
        KeyboardButton esliqariya = new KeyboardButton();
        esliqariya.setText("37-qism Esli-hushli qariya");
        KeyboardButton afsona = new KeyboardButton();
        afsona.setText("38-qism Eskilardan qolgan bir afsona");
        KeyboardButton hojilar = new KeyboardButton();
        hojilar.setText("39-qism Hojilarga nima deymiz?");
        KeyboardButton malak = new KeyboardButton();
        malak.setText("40-qism Jahannamni qo'riqlaydigan 19 malak");
        KeyboardButton ulimdanKeyin = new KeyboardButton();
        ulimdanKeyin.setText("41-qism O'limdan keyinga doir");
        KeyboardButton vahiy = new KeyboardButton();
        vahiy.setText("42-qism Vahiyning bir muddat to'xtab qolishi");
        KeyboardButton vijdonAzobi = new KeyboardButton();
        vijdonAzobi.setText("43-qism Vijdon azobi va ovchi yigit");
        KeyboardButton maxsusDuo = new KeyboardButton();
        maxsusDuo.setText("44-qism Maxsus bir duo");
        KeyboardButton habashoiston = new KeyboardButton();
        habashoiston.setText("45-qism Habashiston sari");
        KeyboardButton taklif = new KeyboardButton();
        taklif.setText("46-qism Favqulotda bir taklif");
        KeyboardButton habashiston2 = new KeyboardButton();
        habashiston2.setText("47-qism Habashiston sari yana bir safar");
        KeyboardButton haqliBolish = new KeyboardButton();
        haqliBolish.setText("48-qism Haqli bo'lish yetarlimi?");
        KeyboardButton backButton = new KeyboardButton();
        backButton.setText("Ortga qaytish↪");


        first.add(muqaddima);
        first.add(kabayiqladimi);
        second.add(kabayiqiladimi2);
        second.add(mavlid);
        three.add(sadYurtida);
        three.add(abvoda);
        four.add(mehrQuchogi);
        four.add(zamzam);
        five.add(birQurbon);
        five.add(azimdaraxti);
        six.add(abuTolib);
        six.add(bulutlar);
        seven.add(shomSafari);
        seven.add(suiqast);
        eight.add(bulutlarQoshida);
        eight.add(arslonBolasi);
        nine.add(fijor);
        nine.add(sharafliAhdlashuv);
        ten.add(solmon);
        ten.add(savdoKarvon);
        elevn.add(nikoh);
        elevn.add(jasurBirBola);
        twelve.add(mahbus);
        twelve.add(dardliOta);
        thirtteen.add(hakamli);
        thirtteen.add(yanaSolmon);
        fourteen.add(yahudiyOlimlar);
        fourteen.add(dinYulida);
        fiveteen.add(ukozBozori);
        fiveteen.add(kutilganTong);
        sixteen.add(oydinliklarSari);
        sixteen.add(ochiqdavat);
        seventeen.add(nizo);
        seventeen.add(Bilol);
        eightteen.add(Yosir);
        eightteen.add(abujahl);
        nineteen.add(esliqariya);
        nineteen.add(afsona);
        twenty.add(hojilar);
        twenty.add(malak);
        twentyone.add(ulimdanKeyin);
        twentyone.add(vahiy);
        twentytwoo.add(vijdonAzobi);
        twentytwoo.add(maxsusDuo);
        twentythree.add(habashoiston);
        twentythree.add(taklif);
        twentyfour.add(habashiston2);
        twentyfour.add(haqliBolish);
        twentyfive.add(backButton);


        List<KeyboardRow> rowList = new ArrayList<>();
        rowList.add(first);
        rowList.add(second);
        rowList.add(three);
        rowList.add(four);
        rowList.add(five);
        rowList.add(six);
        rowList.add(seven);
        rowList.add(eight);
        rowList.add(nine);
        rowList.add(ten);
        rowList.add(elevn);
        rowList.add(twelve);
        rowList.add(thirtteen);
        rowList.add(fourteen);
        rowList.add(fiveteen);
        rowList.add(sixteen);
        rowList.add(seventeen);
        rowList.add(eightteen);
        rowList.add(nineteen);
        rowList.add(twenty);
        rowList.add(twentyone);
        rowList.add(twentytwoo);
        rowList.add(twentythree);
        rowList.add(twentyfour);
        rowList.add(twentyfive);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    private SendMessage handleStart(Message message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Assalomu alaykum Saodat Asri Qissalari audio botiga xush kelibsiz! ☺️");
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow first = new KeyboardRow();
        KeyboardButton birinchiKitob = new KeyboardButton();
        birinchiKitob.setText("Birinchi kitob \uD83D\uDCD8");

        KeyboardButton ikkinchiKitob = new KeyboardButton();
        ikkinchiKitob.setText("Ikkinchi kitob \uD83D\uDCD4");

        KeyboardButton uchunchiKitob = new KeyboardButton();
        uchunchiKitob.setText("Uchunchi kitob \uD83D\uDCD3");

        KeyboardButton turtinchiKitob = new KeyboardButton();
        turtinchiKitob.setText("To`rtinchi kitob \uD83D\uDCD5");

        KeyboardRow second = new KeyboardRow();


        first.add(birinchiKitob);
        first.add(ikkinchiKitob);
        second.add(uchunchiKitob);
        second.add(turtinchiKitob);

        rowList.add(first);
        rowList.add(second);
        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
}
