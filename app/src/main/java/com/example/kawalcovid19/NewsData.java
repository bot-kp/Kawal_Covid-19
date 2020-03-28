package com.example.kawalcovid19;

import com.example.kawalcovid19.model.statistics.NewsModel;

import java.util.ArrayList;

public class NewsData {
    private static String[] newsTitle = {
            "Pemprov Jabar Siapkan Dana Bantuan bagi Masyarakat Terdampak COVID-19",
            "Pemerintah Ungkap Penyebab Kasus Corona Capai 1.046 Orang",
            "Wagub Jabar Minta Warga Disiplin Isolasi Mandiri",
    };
    private static String[] newsDetails = {
            "KOTA BANDUNG – Pemerintah Provinsi (Pemprov) Jawa Barat (Jabar) bersama Dewan Perwakilan Rakyat Daerah (DPRD) Jabar sepakat untuk menyalurkan dana bantuan jaring pengaman sosial kepada masyarakat terdampak gejolak ekonomi akibat pandemi penyakit COVID-19. Bantuan ini akan menyesuaikan arahan dari Pemerintah Pusat.\n" +
                    "\n" +
                    "Gubernur Jawa Barat Ridwan Kamil mengumumkan hal tersebut usai Rapat Koordinasi (Rakor) Dampak Pandemi COVID-19 Terhadap Perekonomian Jawa Barat, di Gedung Sate, Kota Bandung, Kamis (26/3/20).\n" +
                    "\n" +
                    "Hadir dalam rakor Ketua DPRD Jabar Taufik Hidayat beserta jajaran Pimpinan, para ketua fraksi dan komisi DPRD, Badan Perencanaan Pembangunan Daerah (Bappeda) Jabar, dan para kepala dinas.\n" +
                    "\n" +
                    "“Dalam waktu dekat, kita akan menyalurkan bantuan kepada warga Jawa Barat yang terdampak COVID-19,” ujar Gubernur.\n" +
                    "\n" +
                    "Kang Emil –sapaan akrab Gubernur— menyebutkan, penyaluran bantuan tersebut akan difokuskan kepada masyarakat miskin yang belum mendapatkan program perlindungan sosial dari Anggaran Pendapatan dan Belanja Negara (APBN) sebanyak 367.825 keluarga rumah tangga sasaran (KRTS), serta keluarga rentan miskin sebanyak 551.700 atau total sasaran sebanyak 919.525 KRTS.\n" +
                    "\n" +
                    "Keluarga rentan miskin yang dimaksud antara lain mereka yang mengalami kesulitan ekonomi karena pekerjaan atau usahanya yang terpuruk akibat pandemi COVID-19, juga mereka yang mungkin kehilangan pekerjaan alias menganggur karena terkena pemutusan hubungan kerja (PHK).\n" +
                    "\n" +
                    "Pemprov Jabar menyiapkan sejumlah skenario, salah satunya adalah dalam penerapan pembatasan interaksi sosial (social distancing) selama empat bulan, KRTS ini akan memperoleh bantuan tunai senilai Rp 100.000 per keluarga per bulan, juga bantuan nontunai/ sembako senilai Rp 200.000 per keluarga per bulan, atau dengan total Rp 300.000 per keluarga per bulan.\n" +
                    "\n" +
                    "Akan tetapi dari pihak DPRD mengusulkan, bagaimana jika bantuan itu diperbesar nilainya menjadi Rp 500.000 per keluarga per bulan, dengan komposisi 70 persen untuk bantuan nontunai, dan 30 persen bantuan tunai.\n" +
                    "\n" +
                    "“Kami gerak cepat, kalau tidak ada halangan, sesuai arahan Pemerintah Pusat bantuan ini akan kami salurkan ke keluarga miskin dan rentan miskin yang jumlahnya mendekati 1 juta keluarga,” ujar Kang Emil.\n" +
                    "\n" +
                    "Menurut Kang Emil, sehubungan dengan usulan DPRD itu akan dikaji kembali oleh Bappeda Jabar bersama tim ahli.\n" +
                    "\n" +
                    "Dana yang akan dianggarkan Pemda Provinsi Jabar untuk program jaminan sosial di luar pemerintah pusat akan diambil dari APBD 2020 yang telah digeser. Menurut Kang Emil, berdasarkan arahan Presiden RI, pemerintah daerah dapat menggeser (refocusing) beberapa mata anggaran seperti penghematan perjalanan dinas pejabat, dana desa, dan anggaran proyek yang tidak berhubungan langsung dengan masyarakat.\n" +
                    "\n" +
                    "“Dari mana anggarannya? Sesuai arahan Presiden, menghemat perjalanan dinas, menggeser peruntukkan dana desa, anggaran-anggaran proyek yang tidak signifikan atau berhubungan langsung dengan masyarakat,” jelas Kang Emil.\n" +
                    "\n" +
                    "Sebagai tambahan, Kang Emil akan mewajibkan pemerintah kabupaten/kota agar menganggarkan dana dari APBD sehingga total bantuan yang akan didapat oleh misbar ini akan lebih besar lagi. “Dan kita berikan tugas, arahan, 27 kabupaten/kota harus memberikan tambahan sesuai kemampuan,” jelasnya.\n" +
                    "\n" +
                    "Dalam jaring pengaman sosial ini, sambung Kang Emil, juga akan diberikan lewat kegiatan padat karya, upaya menurunkan beban pengeluaran masyarakat miskin dengan bantuan pendidikan universal untuk sekolah menengah swasta dan penerimaan bantuan iuran jaminan kesehatan nasional (PBI-JKN), serta bantuan untuk keluarga yang anggotanya terindikasi sebagai Orang Dalam Pemantauan (ODP), Pasien Dalam Pengawasan (PDP), dan terinfeksi Covid-19.\n" +
                    "\n" +
                    "Dari lima komponen program jaring pengaman sosial untuk skenario penerapan social distancing selama empat bulan ini diperkirakan akan menelan anggaran sekitar Rp 14,187 triliun.",
            "Kasus positif corona di Indonesia mengalami kenaikan yang signifikan. Hingga Jumat (27/3), sudah ada 1.046 pasien positif tertular virus corona, atau penambahan 153 kasus. \n Juru bicara pemerintah untuk penanganan corona, Achmad Yurianto, mengatakan ada sejumlah faktor yang membuat angka positif COVID-19 terus melonjak. \n" +
                    "\"Dari hari ke hari kita lihat ada penambahan kasus signifikan. Ini menandakan bahwa penularan masih berlangsung terus-menerus. Ini kita maknai masih ada kasus positif yang masih ada di tengah-tengah kita semua,\" kata Yuri saat konferensi pers di gedung BNPB, Jakarta, Jumat (27/3).",
            "KOTA BANDUNG -- Wakil Gubernur (Wagub) Jawa Barat (Jabar) Uu Ruzhanul Ulum meminta warga yang memiliki riwayat ke luar negeri dalam waktu dekat atau melakukan kontak jarak dekat dengan orang positif COVID-19 untuk mengisolasi diri.\n" +
                    "\n" +
                    "Isolasi mandiri alias self-isolation selama 14 hari itu perlu dilakukan sebagai upaya mencegah dan menghentikan penyebaran virus SARS-CoV-2 yang menyebabkan penyakit COVID-19 kepada keluarga, teman, dan orang-orang sekitarnya.\n" +
                    "\n" +
                    "\"Harapan kami kepada mereka yang dari luar negeri, jangan dulu berinteraksi dengan masyarakat maupun dengan pihak keluarga selama 14 hari,\" kata Kang Uu pada Rabu (25/3).\n" +
                    "\n" +
                    "Kang Uu pun meminta masyarakat yang menerapkan self-isolation agar selalu disiplin dengan mengikuti semua imbauan pemerintah, termasuk physical distancing atau tidak bertatap muka dengan orang lain sama sekali.\n" +
                    "\n" +
                    "Saat isolasi mandiri dilakukan, warga tidak boleh meninggalkan rumah kecuali untuk memeriksakan diri, memakai masker, rajin membersihkan barang umum seperti remote, gawai, meja, serta mencuci alat makan dan pakaian secara terpisah.\n" +
                    "\n" +
                    "Warga yang mengisolasi diri secara mandiri juga diminta untuk terus menjaga kebugaran dengan aktivitas atau olahraga mudah di rumah. Cuci tangan hingga menjaga sirkulasi udara pun tetap harus diperhatikan.\n" +
                    "\n" +
                    "\"Ini sebagai bentuk kehati-hatian kita dan kekhawatiran pemerintah, tujuannya supaya COVID-19 yang sekarang (penyebaran) ramai di Jawa Barat bisa diantisipasi. Harapan kami, seluruh masyarakat bisa disiplin,\" ucap Kang Uu.\n" +
                    "\n" +
                    "\"Kalau masyarakat tidak disiplin, yang kena mudarat (kerugian) adalah masyarakat itu sendiri. Ini pun sesuai dengan arahan Pak Gubernur (Ridwan Kamil) untuk menghindari kerumunan,\" tambahnya. \n" +
                    "\n" +
                    "Selain itu, Kang Uu menegaskan bahwa warga Jabar yang tengah melakukan isolasi mandiri selama 14 hari pun harus rutin mengecek kesehatannya.\n" +
                    "\n" +
                    "Jika ada gejala-gejala COVID-19 seperti batuk, sesak napas, dan demam, Kang Uu mengimbau agar mereka segera memeriksakan kesehatan ke rumah sakit rujukan.\n" +
                    "\n" +
                    "\"Begitu banyak yang memberi informasi, baik dari pemerintah, pihak swasta, lewat media massa maupun media sosial dan lainnya, jadi begitu mudah untuk mencari bagaimana tanda-tanda orang yang kena COVID-19,\" ujarnya."
    };

    private static String[] affairsName = {
            "Kumparan",
            "Jogja Dalam Berita",
            "Diki Kopet"
    };
    private static String[] newsDate = {
            "Jumat, 27 Maret 2020 14.25 WIB",
            "Jumat, 27 Maret 2020 20.21 WIB",
            "Sabtu, 28 Maret 2020 20.21 WIB"
    };
    private static int[] affairsLogo = {
            R.drawable.positif,
            R.drawable.about_us,
            R.drawable.ic_shield
    };
    private static int[] newsTumbnail = {
            R.drawable.flipper_main,
            R.drawable.flipper_content_2,
            R.drawable.logo_kulon_progo
    };
    public static ArrayList<NewsModel> getNewsList(){
        NewsModel newsModel = null;
        ArrayList<NewsModel> list = new ArrayList<>();

        for (int i = 0; i < newsTitle.length; i++){
            newsModel = new NewsModel();
            newsModel.setNewsTumbnail(newsTumbnail[i]);
            newsModel.setTitleNews(newsTitle[i]);
            newsModel.setDetailNews(newsDetails[i]);
            newsModel.setAffairsLogo(affairsLogo[i]);
            newsModel.setAffairsName(affairsName[i]);
            newsModel.setNewsDate(newsDate[i]);

            list.add(newsModel);
        }
        return list;
    }
}
