package com.example.kawalcovid19;

import java.util.ArrayList;

public class ExpandableData {
    private static String[] title_FaQ = {
            "Apa itu Virus Corona?",
            "Apa itu COVID-19?",
            "Bagaimana COVID-19 menyebar?",
            "Mengapa kita dilarang untuk berjabat tangan bila virusnya menular lewat seseorang ketika batuk?",
            "Mengapa kita harus rajin mencuci tangan?",
            "Apa itu social distancing?",
            "Bagaimana caranya menjaga jarak minimal 1 meter di tempat umum apalagi di dalam kendaraan umum?",
            "Perlukah memakai masker?",
            "Apa itu Lockdown?",
            "Apa itu ODP, PDP, dan Suspect?",
            "Apa itu karantina mandiri?",
            "Rekomendasi dosis Vitamin C",
            "Perlukah membuat hand sanitizer sendiri?",
            "Benarkah kita tidak akan tertular COVID-19 bila mengonsumsi rempah-rempah?",
            "Bagaimana cara membersihkan perabotan di rumah?",
            "Apakah seseorang yang pernah terjangkit virus corona dapat kembali sakit untuk kedua kalinya?"

    };
    private static String[] details_FaQ = {
            "COVID-19 adalah nama penyakit yang disebabkan oleh jenis virus corona yang paling baru. Virus dan penyakit ini pertama kali ditemukan di Wuhan, China. Diduga virus ini muncul pada November 2019 dan menyerang seorang lelaki usia paruh baya. Umumnya penderita akan mengalami gejala seperti demam, kelelahan, dan batuk kering alias tidak menghasilkan dahak.\n" +
                    "\n" +
                    "Di luar tiga gejala umum tersebut, ada pula penderita yang mengeluhkan nyeri, hidung tersumbat, pilek, sakit tenggorokan, maupun diare.\n" +
                    "\n" +
                    "Sekitar 80% dari penderita Covid-19 hanya mengalami sakit yang ringan hingga sedang dan dapat sembuh tanpa perlu perawatan khusus. Namun 1 dari 6 penderita mengalami sesak napas. Covid-19 bukan penyakit berbahaya kecuali untuk lansia dan orang-orang yang rentan karena memiliki imunitas rendah atau penyakit penyerta.",
            "Covid-19 ditularkan dari seseorang yang sedang batuk atau membuang napas. Tetesan cairan dari hidung atau mulut penderita Covid-19 inilah yang mengandung virus dan dapat menulari orang lain. Bila seseorang yang sehat menyentuh wajahnya seperti mata, hidung, ataupun mulut maka virus ini dapat masuk. Inilah mengapa untuk menghindari penularan Covid-19 kita didorong untuk rajin mencuci tangan dan tidak menyentuh wajah (terutama mata, hidung, mulut). Tetesan cairan yang mengandung virus tersebut bisa saja berada di benda-benda sekitar kita sehingga dapat tersentuh oleh jari.\n" +
                    "\n" +
                    "Para ahli juga mendorong orang-orang untuk menjaga jarak minimal 1 meter demi menghindari penyebaran virus. Ketika seseorang batuk dengan keras, tetesan cairannya (droplet) dapat “melompat” jauh sehingga terkena orang lain. Dengan menjaga jarak minimal 1 meter kita menghindari tetesan cairan dari hidung ataupun mulut orang lain. Tentu saja tetap ada risiko penularan lain misalnya melalui udara (airborne). Hal ini telah diketahui oleh WHO.\n" +
                    "\n" +
                    "Berdasarkan penelitian terbaru dalam sebuah jurnal, virus SARS-COV-2 alias virus penyebab penyakit Covid-19 dapat bertahan di udara selama 3 jam. Selain itu virus ini terdeteksi masih berada di atas permukaan plastik maupun stainless steel 72 jam kemudian meski jumlahnya berkurang. Sementara pada permukaan tembaga, virus dapat bertahan kurang dari 4 jam. Pada kertas sendiri dapat bertahan hingga 24 jam.",
            "Covid-19 ditularkan dari seseorang yang sedang batuk atau membuang napas. Tetesan cairan dari hidung atau mulut penderita Covid-19 inilah yang mengandung virus dan dapat menulari orang lain. Bila seseorang yang sehat menyentuh wajahnya seperti mata, hidung, ataupun mulut maka virus ini dapat masuk. Inilah mengapa untuk menghindari penularan Covid-19 kita didorong untuk rajin mencuci tangan dan tidak menyentuh wajah (terutama mata, hidung, mulut). Tetesan cairan yang mengandung virus tersebut bisa saja berada di benda-benda sekitar kita sehingga dapat tersentuh oleh jari.\n" +
                    "\n" +
                    "Para ahli juga mendorong orang-orang untuk menjaga jarak minimal 1 meter demi menghindari penyebaran virus. Ketika seseorang batuk dengan keras, tetesan cairannya (droplet) dapat “melompat” jauh sehingga terkena orang lain. Dengan menjaga jarak minimal 1 meter kita menghindari tetesan cairan dari hidung ataupun mulut orang lain. Tentu saja tetap ada risiko penularan lain misalnya melalui udara (airborne). Hal ini telah diketahui oleh WHO.\n" +
                    "\n" +
                    "Berdasarkan penelitian terbaru dalam sebuah jurnal, virus SARS-COV-2 alias virus penyebab penyakit Covid-19 dapat bertahan di udara selama 3 jam. Selain itu virus ini terdeteksi masih berada di atas permukaan plastik maupun stainless steel 72 jam kemudian meski jumlahnya berkurang. Sementara pada permukaan tembaga, virus dapat bertahan kurang dari 4 jam. Pada kertas sendiri dapat bertahan hingga 24 jam.",
            "Ini karena seseorang bisa saja batuk tanpa menutup mulutnya dengan tissue atau tekuk siku. Seseorang bisa saja batuk dan justru menutup mulut dengan tangan kosong. Ketika ia tidak mencuci tangannya, maka tetesan cairan dari mulutnya yang mengandung virus dapat tertinggal. Tanpa sadar orang ini akan menyentuh barang-barang maupun orang lain sehingga membuat virusnya tersebar ke mana-mana.",
            "Karena bisa saja virus ini menempel pada benda-benda yang kita sentuh dan banyak disentuh orang lain. Misalnya kenop pintu, tombol lift, tombol lampu, pegangan pada troli belanja, atau eskalator.\n" +
                    "\n" +
                    "Saat virus ini menempel di tangan, kita akan lebih mudah tertular penyakit bila tanpa sengaja menyentuh wajah. Dengan menjaga tangan tetap bersih dan mencucinya selama 20 detik minimal satu jam sekali, kita telah mengurangi risiko penyebaran penyakit.",
            "Social distancing bila diartikan ke dalam Bahasa Indonesia adalah jarak sosial. Sebenarnya social distancing alias menjaga jarak secara sosial dilakukan sebagai solidaritas kita terhadap masyarakat. Walaupun sebanyak 80% penderita Covid-19 hanya mengalami gejala ringan hingga sedang dan tak perlu perawatan serius, beberapa pasien lainnya dapat mencapai tahap kritis. Dengan menjaga jarak secara sosial kita membantu lansia dan orang-orang yang memiliki kondisi tubuh rentan untuk tidak tertular penyakit ini.\n" +
                    "\n" +
                    "Social distancing bukan berarti kita tidak boleh keluar rumah sama sekali. Dengan melakukan social distancing kita diharapkan mengisolasi diri dari dunia luar dan tidak berkontak dengan orang lain. Namun kita masih dapat bepergian misalnya membeli bahan makanan ke supermarket atau membeli makanan di restoran secara takeaway. Sebisa mungkin, kita tidak menerima tamu atau bertamu ke rumah orang lain.\n" +
                    "\n" +
                    "Pada periode social distancing kita juga diharapkan untuk menjaga jarak dari lansia dan orang-orang yang memiliki kondisi tubuh rentan. Sebab dikhawatirkan kita sendiri telah membawa virusnya tetapi tidak menyadarinya. Beberapa orang dapat menderita Covid-19 tanpa gejala. Saat ia bepergian dan bertemu orang lain, tanpa sengaja ia menularkan penyakitnya. Inilah yang harus menjadi perhatian kita untuk dihindari.\n" +
                    "\n" +
                    "Anak-anak juga harus melakukan social distancing. Menurut sebuah studi, 13% dari anak-anak yang positif mengidap Covid-19 diketahui tidak memiliki gejala. Ini membuat anak-anak menjadi carrier (pembawa) bagi virus tersebut. Karena itu pada negara seperti Italia, selama wabah Covid-19 berlangsung maka anak-anak dilarang mengunjungi nenek atau kakeknya",
            "Dengan menjauhi keramaian seperti tidak pergi ke mall, restoran, kantor, atau taman kota. Untuk menghindari penyebaran virus, kita perlu menghindari kondisi di mana kita harus berdesak-desakkan.\n" +
                    "\n" +
                    "Pemerintah di beberapa negara mengurangi kapasitas angkutan umum yang beroperasi sehingga hanya boleh terisi sepertiganya saja. Selain itu kita dapat mengganti penggunaan angkutan umum massal dengan naik kendaraan pribadi atau berjalan kaki. Bila tidak memungkinkan juga, sebaiknya menghindari naik angkutan umum di jam-jam sibuk.",
            "Menurut konsultan paru sub infeksi RSUP Persahabatan, dr Erlina Burhan, orang sehat pakai masker kalau berada di keramaian. Tetapi kalau di rumah atau jalanan yang tidak ramai, tidak perlu. Masker digunakan apabila kita sedang sakit, agar tidak menularkan virus ke orang sekitar kita.\n" +
                    "\n" +
                    "Masker merupakan salah satu cara mengantisipasi terkena droplet dari orang lain misalnya saat batuk atau bersin. Droplet ini bisa saja mengandung virus termasuk COVID-2019 atau bakteri.\n" +
                    "\n" +
                    "Ketimbang hanya memusingkan urusan masker, mencegah terkena virus corona yang utama adalah menjaga sistem kekebalan tubuh dengan mengonsumsi makanan bergizi seimbang, cukup istirahat, aktivitas fisik rutin.",
            "Lockdown dapat diartikan sebagai terkunci atau kuncitara. Artinya ini adalah kondisi ketika sebuah negara menutup dirinya sehingga tidak ada orang yang bisa keluar ataupun masuk.\n" +
                    "\n" +
                    "Bila melakukan lockdown, semua fasilitas umum yang ada harus ditutup. Kecuali fasilitas yang harus tetap buka demi kebutuhan primer masyarakat seperti supermarket, apotik, dan rumah sakit. Namun aturan lockdown sendiri berbeda-beda dari tiap negara.\n" +
                    "\n" +
                    "Misalnya Italia melakukan lockdown dengan sangat ketat sehingga orang yang melanggar dan pergi keluar rumah didenda oleh negara. Sementara di Irak, mereka tidak menggunakan kata lockdown tapi memberlakukan jam malam. Beberapa negara di Afrika menutup perbatasannya dan tidak menerima turis dari negara lain. Belanda melakukan lockdown tapi mengizinkan warganya untuk keluar rumah membeli ganja selama dibeli secara takeaway. Di beberapa negara lockdown artinya orang-orang tetap bekerja tapi tidak bisa mampir ke mall ketika pulang.",
            "PDP: Pasien Dalam Pengawasan adalah orang yang mengalami infeksi saluran pernapasan akut dengan demam di atas 38 derajat, batuk, sesak napas, sakit tenggorokan, pilek, dan pneumonia. Selain itu orang tersebut memiliki riwayat perjalanan dari luar negeri atau kontak dengan pasien positif Covid-19.\n" +
                    "\n" +
                    "ODP: Orang Dalam Pemantauan adalah seseorang yang memiliki riwayat perjalanan dari luar negeri tapi tidak memiliki tanda-tanda sakit.\n" +
                    "\n" +
                    "Seseorang akan disebut sebagai Suspect bila ia diduga kuat menderita Covid-19. Misalnya memiliki gejala-gejala penyakit Covid-19 dan ada riwayat kontak dengan pasien positif. Riwayat kontak ini minimal berjarak dua meter.",
            "Karantina mandiri adalah tindakan mengisolasi diri terhadap orang lain dan bukan dilakukan di bawah pengawasan rumah sakit ataupun negara. Orang-orang yang baru saja pulang dari wilayah yang mengalami wabah Covid-19 didorong untuk melakukan karantina pada dirinya sendiri minimal selama 14 hari. Hal ini dilakukan untuk memastikan apakah dirinya terpapar virus atau tidak. Waktu 14 hari adalah masa inkubasi rata-rata virus tersebut sebelum orang yang terpapar menunjukkan gejala sakit.",
            "Rekomendasi dosis bervariasi dengan tingkat keparahan penyakit, mulai dari 50-200 miligram per kilogram berat badan per hari.\n" +
                    "\n" +
                    "Misalnya: Berat badan 60 kg x 50 mg (dosis terendah) = konsumsi minimal Vitamin C per hari 3000 mg = 3 botol You-C 1000",
            "Tidak perlu karena sabun lebih efektif dalam membersihkan tangan dari virus maupun bakteri. Hand sanitizer hanya menjadi pertolongan ketika berada di luar rumah dan tidak bisa mengakses air maupun sabun. Namun jangan asal meracik dengan mengikuti resep yang tidak jelas kredibilitasnya di internet.\n" +
                    "\n" +
                    "Pastikan bahwa resep hand sanitizer yang kita ikuti berasal dari pihak yang dapat dipercaya seperti WHO, BPOM, dan LIPI. Jangan menambah-nambahkan resep dengan produk yang tidak perlu atau tidak terjamin secara ilmiah seperti minyak essensial.",
            "Belum ada penelitian ilmiah yang membuktikan hal ini sehingga jawabannya adalah tidak. Selama seseorang berkontak dengan pasien positif covid-19 dan mendapat tetesan cairan dari batuk atau napas yang dibuang maka orang tersebut dapat tertular. Namun dampak dari penularannya berbeda-beda tergantung daya tahan tubuh seseorang.",
            "Selain rajin menyapu dan mengepel, kita bisa membuat cairan desinfektan sendiri untuk membersihkan perabotan. Menurut dokter Nahla Shihab, kita dapat mencampurkan 95ml Bayclin dengan 905ml air.\n" +
                    "\n" +
                    "Jangan mencampurkannya dengan bahan lain karena dapat menimbulkan gas berbahaya. Hanya gunakan cairan desinfektan ini di ruangan dengan ventilasi yang baik. Bila memiliki kulit yang sensitif, bersihkan perabotan menggunakan sarung tangan.",
            "Bisa karena ada laporan bahwa pasien yang telah sembuh di Jepang dan China kembali masuk rumah sakit karena hasil tesnya positif. Namun para peneliti belum mampu menyimpulkan mengapa seseorang bisa terjangkit virus corona hingga dua kali. Awalnya, seseorang dianggap tidak akan terjangkit kembali bila pernah mengidap Covid-19. Peneliti berasumsi tubuh akan membangun kekebalan terhadap virus tersebut sehingga seseorang tidak akan terjangkit kembali. Sayangnya masih banyak hal yang tidak kita ketahui tentang virus ini sehingga kesimpulan sulit ditarik.\n" +
                    "\n" +
                    "Ada dugaan bahwa bisa saja hasil tes tersebut salah sehingga orang yang keluar dari rumah sakit belum benar-benar sembuh dari Covid-19. Para peneliti juga tidak tahu apakah ini mungkin sifat dari Covid-19 itu sendiri. Atau mungkin tubuh pasien yang telah sembuh tersebut tidak mampu membangun kekebalan yang dibutuhan sehingga ia positif Covid-19 untuk kedua kalinya."
    };

    public static ArrayList<ExpandableModel> getExpandableModels(){
        ExpandableModel heroes = null;
        ArrayList<ExpandableModel> list = new ArrayList<>();

        for (int i = 0; i < title_FaQ.length; i++){
            heroes = new ExpandableModel();
            heroes.setTitle(title_FaQ[i]);
            heroes.setDetails(details_FaQ[i]);
            list.add(heroes);
        }
        return list;
    }
}
