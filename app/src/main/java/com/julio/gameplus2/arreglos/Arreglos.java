package com.julio.gameplus2.arreglos;


import com.julio.gameplus2.R;
import com.julio.gameplus2.modelos.Categoria;
import com.julio.gameplus2.modelos.Games;
import com.julio.gameplus2.modelos.VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class Arreglos {
    public static List<VideoJuego> masEsperados= new ArrayList<>();
    static VideoJuego masEsperado1 = new VideoJuego("Final Fantasy vll remake","Nueva adaptación de la obra maestra del rol japonés. El remake del séptimo capítulo de la saga nos trasladará al mundo de la entrega original de PlayStation y PC, renovando sus gráficos para la consola PlayStation 4, añadiendo nuevos detalles la historia, así como aportando presumibles cambios jugables al sistema de batallas y de exploración. Este nuevo 'Final Fantasy VII' tiene detrás al mismo equipo creativo del original.", R.drawable.final_fantasy_vii_remake);
   static VideoJuego masEsperado2 = new VideoJuego("Cyberpunk 2077","es el nuevo videojuego de rol en primera persona con estructura de mundo abierto de CD Projekt RED. Los padres de The Witcher nos presentan para Xbox One, PC y PS4 una aventura de corte futurista y ciberpunk en la que encarnaremos a un personaje diseñado a nuestra medida y en la que tendremos que sobrevivir en una peligrosa urbe plagada de corporaciones, ciborgs, bandas y las más variadas amenazas tecnológicas.", R.drawable.cyberpunk_2077);
   static VideoJuego masEsperado3 = new VideoJuego("The Last of Us 2","es la secuela de The Last of Us, uno de los juegos más aclamados de la consola PS3, que apareció en 2015 en PS4 en versión remasterizada. Esta continuación ha sido anunciada en el evento PlayStation Experience de diciembre de 2016, generando grandísimas expectativas entre los jugadores.", R.drawable.the_last_of_us_part_ii);
   static VideoJuego masEsperado4 = new VideoJuego("Death Stranding","es un título de acción, aventura y exploración en mundo abierto de ambientación postapocalíptica. Se trata del nuevo videojuego de Hideo Kojima, padre de Metal Gear y Snatcher, una enigmática obra que se define como el primer juego de su género, ya que incluye una serie de mecánicas, detalles y aspectos que lo alejan de otros videojuegos similares.", R.drawable.death_stranding);
   static VideoJuego masEsperado5 = new VideoJuego("Ghost of Tsushima","Sucker Punch, creadores de la saga inFamous presentan un nuevo videojuego de acción, sigilo y aventura para PlayStation 4 de forma exclusiva, que cambia la ambientación de ciencia ficción y personajes mutantes para trasladarnos a un pasado histórico de gran veracidad. Ghost of Tsushima nos llevará a un Japón feudal exquisitamente recreado en lo que es uno de los videojuegos más ambiciosos de la plataforma de Sony.", R.drawable.ghost_of_tsushima);
   static VideoJuego masEsperado6 = new VideoJuego("Beyond Good & Evil 2"," es un videojuego de acción y aventura en tercera persona desarrollado y producido por Ubisoft para las plataformas de PC, PS4 y Xbox One, Presentado durante el E3 de 2017, pero por el momento sin fecha de lanzamiento confirmada.\n" +
           "\n" +
           "A pesar de su nombre no se trata de una secuela, sino de una precuela de Beyond Good & Evil lanzado a finales de 2003, por lo tanto narrará los hechos ocurridos antes de los acontecimientos y aventuras de Jade en el primer juego.", R.drawable.beyond_good_evil_2);
   static VideoJuego masEsperado7 = new VideoJuego("Star Citizen","Star Citizen es un videojuego de simulación espacial para PC, aunque se desconoce si saldrá en PS4 o Xbox. El juego está siendo desarrollado por el estudio Cloud Imperium Games con su diseñador: Chris Roberts a la cabeza, conocido por ser el creador de los exitosos Wing Commander y Freelancer.\n" +
           "\n" +
           "Se trata de un videojuego que se presenta como la revolución de los juegos espaciales ya que permitirá explorar una gigantesca galaxia con más de 150 sistemas solares, aterrizar y descubrir planetas 100% explorables y de un tamaño de mapa colosal, combatir en conflictos espaciales, relacionarnos con otros jugadores o hasta descubrir alienígenas u otras formas de vida. En resumen Star Citizen pretende ofrecer todas las posibilidades imaginables para tratar de convertirse en el simulador de vida y exploración espacial definitivo.", R.drawable.star_citizen);
   static VideoJuego masEsperado8 = new VideoJuego("Deep Down","Deep Down es el videojuego de rol y aventuras en tercera persona con componente online desarrollado por Capcom bajo la supervisión de Yoshinori Ono y Teruki Miyashita. Ambientado en un mundo futurista, concretamente en la Nueva York del año 2094, el título nos invitará a encarnar a una serie de jugadores que se conectan a un potente programa de realidad virtual que traslada a los usuarios a un mundo de fantasía enmarcado dentro de la época medieval. Diseñado para PlayStation 4 y con opciones online, su desarrollo sigue siendo un misterio.", R.drawable.deep_down);
   static VideoJuego masEsperado9 = new VideoJuego("Dead Island 2","Dead Island 2 es un videojuego de acción y rol en primera persona ambientado en un mundo abierto infestado de Zombis. El juego ha sido desarrollado por Sumo Digital y distribuido por Kotch Media para las plataformas de PS4, PC y Xbox One, con fecha de lanzamiento el 31 de diciembre de 2017.", R.drawable.dead_island_2);
   static VideoJuego masEsperado10 = new VideoJuego("Shenmue III","Shenmue 3 es la esperada continuación de la serie de Shenmue, que desde 2002 no ha tenido nuevas entregas y ha dejado en el aire la historia de Ryo Hazuki. Esta tercera parte aspira a continuarla y a concluirla, y está siendo desarrollada por Yu Suzuki con la colaboración de Sony y la financiación de miles de personas.", R.drawable.shenmue_iii);


   public static List<Categoria> categorias = new ArrayList<>();

   private static Categoria categoria1 = new Categoria("Accion",R.drawable.darksiders_iii_deluxe_edition);
   private static Categoria categoria2 = new Categoria("Carreras",R.drawable.need_for_speed_most_wanted);
   private static Categoria categoria3 = new Categoria("Lucha",R.drawable.tekken_7_deluxe_edition);
   private static Categoria categoria4 = new Categoria("Rol",R.drawable.sekiro_shadows_die_twice);
   private static Categoria categoria5 = new Categoria("Zombies", R.drawable.resident_evil_2_2019_deluxe_edition);
   private static Categoria categoria6 = new Categoria("Plataformas",R.drawable.dead_cells);


    static {
        masEsperados.add(masEsperado1);
        masEsperados.add(masEsperado2);
        masEsperados.add(masEsperado3);
        masEsperados.add(masEsperado4);
        masEsperados.add(masEsperado5);
        masEsperados.add(masEsperado6);
        masEsperados.add(masEsperado7);
        masEsperados.add(masEsperado8);
        masEsperados.add(masEsperado9);
        masEsperados.add(masEsperado10);

        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        categorias.add(categoria5);
        categorias.add(categoria6);
    }

    //juegos de accion
    private static Games games = new Games("Wolfenstein Youngblood", R.drawable.wolfenstein_youngblood_deluxe_edition," es la primera aventura cooperativa moderna de Wolfenstein. Diecinueve años después de los acontecimientos de Wolfenstein II, B. J. Blazkowicz ha desaparecido tras una misión en el París ocupado por los nazis.");
    private static   Games games2 = new Games("Remnant From the Ashes", R.drawable.remnant_from_the_ashes,"es un juego de supervivencia en tercera persona ambientado en un mundo postapocalíptico infestado de criaturas monstruosas. Como superviviente de la humanidad, te embarcarás en una aventura a solas o en compañía de grupos de hasta tres jugadores para enfrentarte a hordas de enemigos mortales ");
    private static   Games games3 = new Games("Apsulov End of Gods", R.drawable.apsulov_end_of_gods_210x300,"Los humanos exploraron las profundidades de la tierra para encontrar la misericordia de los dioses. Pero lo que encontraron no debía llegar a la superficie. Ni a Midgard, ni a ninguno de los nueve reinos de Yggdrasil. Ahora su descubrimiento causa estragos en el mundo, explotando su tecnología");
    private static   Games games4 = new Games("Sniper Ghost Warrior 3", R.drawable.sniper_ghost_warrior_3_season_pass_edition,"Sitúate detrás de las líneas enemigas en el shooter militar moderno definitivo. Métete en la piel de un francotirador estadounidense desplegado en Georgia, cerca de la frontera rusa. Elige tu propio camino para completar las misiones a lo largo de un implacable mundo abierto.");
    private static   Games games5 = new Games("Immortal Unchained", R.drawable.immortal_unchained,"Immortal: Unchained es una nueva entrega del género de los RPG de acción. Conviértete en un arma viviente cuya misión es detener el origen de un evento catastrófico que amenaza con acabar con todos y cada uno de los mundos. Descubre todos los secretos que aguardan en estas tierras, domina un estilo de combate único y letal y enfréntate a seres de leyenda.");
    private static   Games games6 = new Games("Shadow of the Tomb Raider Croft Edition", R.drawable.shadow_of_the_tomb_raider_digital_deluxe_edition," Vive el momento más crucial de la vida de Lara Croft, en el que se convierte en saqueadora de tumbas. En Shadow of the Tomb Raider, Lara debe dominar una selva mortal, superar tumbas aterradoras y perseverar en su hora más aciaga. Mientras trata de detener un apocalipsis maya");
    private static   Games games7 = new Games("Metal Gear Solid V The Phantom Pain", R.drawable.metal_gear_solid_v_the_phantom_pain,"Konami Digital Entertainment presenta el último capítulo de METAL GEAR SOLID V Experience: METAL GEAR SOLID V: The Phantom Pain. La franquicia entra en una nueva era gracias a la innovadora tecnología de Fox Engine y MGSV: The Phantom Pain ofrece a los jugadores una experiencia de juego de máximo nivel y libertad táctica ");
    private static   Games games8 = new Games("Attack on Titan 2 Final Battle", R.drawable.attack_on_titan_2,"¡La última entrega de la serie «Attack on Titan» está disponible en Windows! Los jugadores libran espectaculares combates en el mundo de «»Attack on Titan»» desde la perspectiva de un soldado individual. ¡Prepárate para la caza de titanes más extrema hasta la fecha!" );
    private static   Games games9 = new Games("Assassins Creed III Remastered", R.drawable.assassins_creed_iii_remastered,"Revive o experimenta por primera vez la Revolución Americana en Assassin’s Creed III Remastered, con gráficos y mecánicas de gameplay mejorados. Además incluye todos los DLC del modo Historia y Assassin’s Creed Liberation Remastered.");

    public static Games[] juegosDeAccion = {
            games,
            games2,
            games3,
            games4,
            games5,
            games6,
            games7,
            games8,
            games9,

    };

    //juegos de carreras
    private static Games c1 =new Games("Forza Horizon 4 Ultimate Edition",R.drawable.forza_horizon_4_ultimate_edition,"es un videojuego de carreras de mundo abierto. Esta es la cuarta entrega de la serie Forza Horizon y la undécima en la saga Forza y está ambientado en Reino Unido. El juego está dividido en 4 estaciones, esas estaciones cambian el ambiente en Reino Unido, también la climatología, y la naturaleza.");
    private static Games c2 =new Games("MX vs ATV All Out",R.drawable.mx_vs_atv_all_out,"¡Todos los terrenos, todos los vehículos, todo tuyo! MX vs ATV All Out es la experiencia de carreras todoterreno definitiva. Elige entre motos, ATV y UTV, pule tu estilo en tu complejo privado y disfruta de distintos modos de juego en enormes mundos abiertos. ¡Elige el modo libre para realizar acrobacias");
    private static Games c3 =new Games("Monster Jam Steel Titans",R.drawable.monster_jam_steel_titans,"Camiones reales. Acción real. ¡Monster Jam! ¡Llega la experiencia definitiva de Monster Jam para disfrute de todo el mundo con Monster Jam Steel Titans! ¡Todos los camiones, acrobacias, estadios, carreras y enormes saltos en un solo juego!");
    private static Games c4 =new Games("DiRT Rally 2.0 Deluxe Edition",R.drawable.dirt_rally_2_0_deluxe_edition,"DiRT Rally 2.0 Deluxe Edition te reta a abrirte camino a través de una selección de ubicaciones de rally icónicas por todo el mundo, en los vehículos todoterreno más potentes de la historia, teniendo en cuenta que el menor de los fallos puede poner fin a tu carrera. Déjate llevar por tus instintos en la experiencia todoterreno más inmersiva hasta la fecha");
    private static Games c5 =new Games("GRID 2 Reloaded Edition",R.drawable.grid_2_reloaded_edition,"Ponte a los mandos, pisa a fondo y persigue la fama en GRID 2, la nueva entrega de Race Driver: GRID, el juego que ganó un premio BAFTA y vendió millones de copias. Sumérgete en agresivas carreras rueda con rueda contra una IA avanzada y vive a fondo la competición con el nuevo sistema de control TrueFeel™");
    private static Games c6 =new Games("Forza Horizon 3 Ultimate Edition",R.drawable.forza_horizon_3_ultimate_edition,"La conducción de mundo abierto de Microsoft recibe su tercera entrega, Forza Horizon 3. Ambientado en los extremos territorios de Australia, el videojuego de velocidad cuenta con el mayor parqué de vehículos visto hasta la fecha en la subsaga de conducción. Cuenta con funcionalidades cross-platform entre PC y Xbox One");
    private static Games c7 =new Games("Need For Speed Payback Deluxe Edition",R.drawable.need_for_speed_payback_deluxe_edition,"El juego tiene lugar en la ciudad ficticia de Fortune Valley (en español, Valle de la Fortuna) ─basada en la ciudad de Las Vegas─ y contara con tres personajes principales; Tyler, Mac y Jess. Juntos intentarán derrotar a The House, una organización criminal que controla a los casinos, los ladrones y la policía de la ciudad.");
    private static Games c8 =new Games("Need for Speed: Most Wanted",R.drawable.need_for_speed_most_wanted,"La acción de mundo abierto en Need for Speed Most Wanted te da la libertad de conducir. Toca saltos y atajos, cambia de automóvil, métete bajo o dirígete hacia el terreno que juega con las fortalezas únicas de tu vehículo. Ábrete paso entre policías y rivales usando habilidades, tecnología de autos de alta gama y toneladas de nitroso.");
    private static Games c9 =new Games("Need for Speed Shift",R.drawable.need_for_speed_shift,"Imagina un juego de carreras hecho por pilotos para amantes de las carreras y te podrás hacer una idea de lo que será Need for Speed Shift. Permitirá a los jugadores experimentar un nivel de realismo nunca visto en un Need for Speed, ofreciendo una increíblemente auténtica experiencia de conducción. Need for Speed Shift ha sido diseñado para recrear la sensación");

    public static  Games[] juegosDeCarreras= {
            c1,
            c2,
            c3,
            c4,
            c5,
            c6,
            c7,
            c8,
            c9
    };

    //juegos de lucha
    private static Games l1 = new Games("Street Fighter V Arcade Edition",R.drawable.street_fighter_v_arcade_edition_2018,"¡La legendaria franquicia de lucha regresa con STREET FIGHTER® V! Disfruta de unos gráficos espectaculares y detalles sin precedentes en la siguiente generación de guerreros mundiales");
    private static Games l2 = new Games("Jump Force Ultimate Edition ",R.drawable.jump_force_ultimate_edition,"Jump Force Ultimate Edition: Los héroes más famosos del manga llegan a un nuevo campo de batalla: nuestro mundo. La Jump Force se une para enfrentarse a la amenaza más peligrosa y proteger el destino de toda la humanidad");
    private static Games l3 = new Games("Dead or Alive 6 Deluxe Edition",R.drawable.dead_or_alive_6_deluxe_edition,"Dead or Alive 6 Deluxe Edition: La franquicia DEAD OR ALIVE es una serie de juegos AAA producidos por el estudio Team NINJA de Koei Tecmo Games. El origen de estos trepidantes juegos de lucha en 3D ");
    private static Games l4 = new Games("TEKKEN 7 Ultimate",R.drawable.tekken_7_deluxe_edition,"Descubre el épico final del clan Mishima y descubre los motivos detrás de cada uno de los pasos de esta batalla interminable. TEKKEN 7 Ultimate Edition , creado con Unreal Engine 4, ofrece espectaculares batallas");
    private static Games l5 = new Games("DRAGON BALL FighterZ Ultimate",R.drawable.dragon_ball_fighterz_ultimate_edition,"DRAGON BALL FighterZ nace de lo que hace a DRAGON BALL tan famosa: luchas espectaculares e interminables con luchadores superpoderosos. Con Arc System Works, DRAGON BALL FighterZ maximiza los combates");
    private static Games l6 = new Games("SOULCALIBUR VI Deluxe Edition",R.drawable.soulcalibur_vi_deluxe_edition,"SOULCALIBUR VI Deluxe Edition ¡Presentamos lo último de la serie SOUL CALIBUR! ¡Disfruta de las nuevas mecánicas de juego y de los gráficos más espectaculares nunca vistos en un juego de lucha con armas! ¡Nuevas mecánicas de combate! ¡Una amplia gama de modos de juego para un jugador! ¡Una gran variedad de modos de juego! y un Personaje invitado… SOULCALIBUR VI Deluxe ");
    private static Games l7 = new Games("The King of Fighters XIV",R.drawable.the_king_of_fighters_xiv_steam_edition,"¡»THE KING OF FIGHTERS XIV» es la última entrega de la aclamada serie de juegos de pelea KOF! Bajo la dirección de Yasuyuki Oda, veterano creador y autor de la serie FATAL FURY, KOF XIV mantiene el icónico sistema de juego");
    private static Games l8 = new Games("Killer Instinct",R.drawable.killer_instinct,"La legendaria serie de juegos de lucha vuelve rebosante de acción, un increíble elenco de luchadores, música trepidante y… ¡¡¡C-C-C-COMBO BREAKERS!!! Elige tu luchador definitivo, que cuenta con animaciones fluidas");
    private static Games l9 = new Games("NARUTO SHIPPUDEN Ultimate Ninja STORM 4 Deluxe Edition",R.drawable.naruto_shippuden_ultimate_ninja_storm_4_deluxe_edition,"¡Con el nuevo título de la aclamada saga STORM emprenderás un viaje impresionante y lleno de color! ¡Benefíciate de un sistema de combate totalmente renovado y prepárate para sumergirte en los combates más espectaculares");

    public static Games[] juegosDeLucha = {
            l1,l2,l3,l4,l5,l6,l7,l8,l9
    };


    //juegos de rol
    private static Games r1 = new Games("Bloodstained Ritual of the Night",R.drawable.bloodstained_ritual_of_the_night,"Bloodstained Ritual of the Night  es un RPG de acción de desplazamiento lateral centrado en la exploración, y contiene los elementos más populares del género Metroidvania en un solo juego repleto de contenido En él encarnas a Miriam, una huérfana trágicamente marcada por la maldición de un alquimista,");
    private static Games r2 = new Games("Sekiro Shadows Die Twice",R.drawable.sekiro_shadows_die_twice,"Sekiro: Shadows Die Twice, elegido mejor juego y mejor juego de acción en la Gamescom de 2018, es la nueva aventura de FromSoftware, creadores de Bloodborne y Dark Souls. Traza tu propio camino hacia la venganza en un nuevo juego de acción y aventuras. En Sekiro: Shadows Die Twice encarnas al «lobo manco», un guerrero desfigurado y caído en batalla");
    private static Games r3 = new Games("SpellForce 3",R.drawable.spellforce_3_loyalty_pack,"Corre el año 518. La rebelión de los magos renegados, las llamadas Guerras Mágicas, ha sido sofocada por la Corona. Sin embargo, ha sido una victoria pírrica. Regiones enteras se han sumido en la anarquía, los refugiados vagan por las tierras en busca de refugio y ha surgido una misteriosa y mortífera plaga conocida como el «hervor de sangre» que se ha extendido con rapidez.");
    private static Games r4 = new Games("Monster Hunter World Deluxe Edition",R.drawable.monster_hunter_world_deluxe_edition,"Monster Hunter World ElAmigos: ¡Bienvenidos a un nuevo mundo! Conviértete en un gran cazador y acaba con feroces monstruos en un ecosistema lleno de vida donde podrás aprovechar tu entorno y su variada flora y fauna para vencer. ¡Caza solo o en cooperativo con hasta tres jugadores más y usa los materiales abandonados por tus enemigos caídos para crear nuevo equipo con que luchar con");
    private static Games r5 = new Games("Darksiders III Deluxe Edition",R.drawable.darksiders_iii_deluxe_edition,"Regresa a una Tierra apocalíptica en Darksiders 3 ElAmigos, una aventura de acción hack-n-slash en la que los jugadores adoptan el papel de Fury, cuya misión es perseguir y deshacerse de los siete Pecados Capitales. Fury, la más impredecible y enigmática de los cuatro jinetes del Apocalipsis, deberá tener éxito donde tantos han fallado: devolver el equilibro a las fuerzas que ahora asolan la");
    private static Games r6 = new Games("Dark Souls III Deluxe Edition",R.drawable.dark_souls_iii_deluxe_edition,"Dark Souls III Deluxe Edition ElAmigos continúa redefiniendo los límites con el nuevo y ambicioso capítulo de esta serie revolucionaria, tan aclamada por la crítica. Adéntrate en un universo lleno de enemigos y entornos descomunales, un mundo en ruinas en el que las llamas se están apagando. Los jugadores se sumergirán en la atmósfera épica de un mundo de");
    private static Games r7 = new Games("Lightning Returns Final Fantasy XIII",R.drawable.lightning_returns_final_fantasy_xiii,"Lightning Returns es el capítulo de cierre de la saga Final Fantasy XIII y la última batalla con Lightning como protagonista. El fin de la trilogía presenta un mundo nuevo, un sinfín de opciones de personalización e increíbles combates cargados de acción.");
    private static Games r8 = new Games("Dragon Quest Heroes II Explorers Edition",R.drawable.dragon_quest_heroes_ii_explorers_edition,"DRAGON QUEST HEROES II es un juego de rol y acción hack-and-slash donde debes devolver la paz a un mundo lleno de monstruos y combates de proporciones épicas. Hasta 4 jugadores pueden unir sus fuerzas en el modo multijugador para despachar a oleadas de enemigos y acabar con los monstruos más imponentes. Puedes elegir entre un montón de personajes jugables con movimientos y");
    private static Games r9 = new Games("NieR Automata Day One Edition",R.drawable.nier_automata_day_one_edition,"NieR: Automata narra la historia de los androides 2B, 9S y A2, que luchan para recuperar el mundo distópico dirigido por las máquinas que han invadido unas poderosas formas de vida mecánicas. Unos alienígenas mecanizados han invadido la Tierra, obligando a la humanidad a abandonarla. En un último intento por recuperar el planeta, la resistencia humana envía un ejército de soldados");
    private static Games r10 = new Games("The Witcher 3 Wild Hunt GOTY",R.drawable.the_witcher_3_wild_hunt_goty,"The Witcher: Wild Hunt es un juego de rol de mundo abierto de nueva generación con una apasionante trama, ambientado en un espectacular universo de fantasía lleno de decisiones trascendentales y consecuencias impactantes. En The Witcher encarnas a Geralt de Rivia, un cazador de monstruos profesional que tiene que encontrar a la muchacha protagonista de una profecía en un");
    private static Games r11 = new Games("BioShock Infinite Game of the Year Edition",R.drawable.bioshock_infinite_game_of_the_year_edition,"es un juego de disparos en primera persona totalmente distinto a todo lo que conoces. Pregunta a los jueces de E3 2011: el juego de Irrational Games obtuvo más de 75 premios editoriales, entre ellos el premio de los críticos al mejor juego del certamen. La acción se desarrolla en 1912, y el jugador controla a Booker DeWitt, un antiguo");

    public static  Games[] juegosRol ={
            r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11
    };

    //juegos de zombies
    private static Games z = new Games("Resident Evil 2 2019 Deluxe Edition",R.drawable.resident_evil_2_2019_deluxe_edition,"Resident Evil 2 2019 Deluxe Edition: Juega campañas individuales tanto para Leon Kennedy como para Claire Redfield con una flamante nueva vista en 3.ª persona mientras exploras las áreas infestadas de zombis de Raccoon City, ahora reconstruido espectacularmente con el motor RE Engine de Capcom. Nuevos rompecabezas, tramas y áreas para que tanto los nuevos fans como los más");
    private static Games z2 = new Games("World War Z",R.drawable.world_war_z,"World War Z  es un emocionante juego de disparos cooperativo (cuatro jugadores) en tercera persona, con hordas masivas de zombis que devoran sin piedad a sus presas vivas. Se centra en un estilo de juego rápido y está inspirado en la increíblemente famosa película de Paramount Pictures del mismo nombre, World War Z. El juego explora nuevas tramas y personajes del");
    private static Games z3 = new Games("The Walking Dead Survival Instinct",R.drawable.the_walking_dead_survival_instinct,"The Walking Dead Survival Instinct  es un shooter de acción basado en la famosa serie The Walking Dead, que cuenta el peregrinaje de los hermanos Daryl y Merle Dixon en busca de las prometidas tierras seguras de Atlanta. El videojuego se ambienta antes de los acontecimientos de la serie.");
    private static Games z4 = new Games("The Evil Within 2",R.drawable.the_evil_within_2,"Surgido de la mente maestra de Shinji Mikami, The Evil Within 2 es la última evolución del survival horror. El detective Sebastián Castellanos lo ha perdido todo, pero podrá salvar a su hija si desciende una vez más al mundo de pesadilla de STEM. Amenazas terribles surgen de cada esquina mientras todo se retuerce y se distorsiona a su alrededor. ¿Se enfrentará a la adversidad cara a cara, con armas");
    private static Games z5 = new Games("The Walking Dead The Final Season",R.drawable.the_walking_dead_the_final_season,"Clementine, que ahora es una superviviente feroz y capaz, ha llegado al capítulo final de su travesía. Tras años de vivir viajando, amenazada por vivos y muertos por igual, al fin encuentra la chance de un hogar en una escuela recóndita. Pero protegerla conllevará sacrificio. Clem tiene que construir su vida y convertirse en líder mientras sigue cuidando a AJ, un niño huérfano que es lo más parecido a una");
    private static Games z6 = new Games("Killing Floor 2 Digital Deluxe Edition",R.drawable.killing_floor_2_digital_deluxe_edition,"En Killing floor 2 los jugadores descenderán hacia el interior de Europa donde la epidemia causada por el experimento fallido de Horzine Biotech ha sido rápidamente difundida y cobrado gran fuerza, esencialmente paralizando a toda la unión europea. Tan solo un mes después de la conclusión de los eventos  en Killing Floor 1");
    private static Games z7 = new Games("Resident Evil Revelations 2 Complete Season",R.drawable.resident_evil_2_2019_deluxe_edition,"Al comienzo de Resident Evil Revelations 2 veremos el espectacular regreso de Claire Redfield, uno de los personajes preferidos de los aficionados. Claire sobrevivió al incidente de Raccoon City narrado en entregas anteriores de Resident Evil y ahora trabaja para la organización antibioterrorista Terra Save. Moira Burton asiste a su fiesta de bienvenida a Terra Save cuando soldados desconocidos asaltan las");
    private static Games z8 = new Games("Resident Evil Revelations Complete Pack",R.drawable.resident_evil_revelations_complete_pack,"Resident Evil® Revelations vuelve remasterizado para PC con imágenes en alta resolución de gran calidad, efectos de iluminación mejorados y una experiencia de sonido que te mete de lleno en la acción. Esta última versión de Resident Evil Revelations llega con contenidos adicionales, como un nuevo y aterrador enemigo, un modo de dificultad extra, integración con ResidentEvil.net y mejoras");
    private static Games z9 = new Games("Resident Evil Zero HD Remaster",R.drawable.resident_evil_zero_hd_remaster,"Resident Evil 0 revela el misterio que se oculta tras el incidente en la mansión, evento que pone en marcha todos los sucesos de la serie de Resident Evil. Esta versión remasterizada presenta la historia y el juego originales con gráficos asombrosos de calidad HD, sonido envolvente de 5.1 canales, controles opcionales modernizados y compatibilidad con TV de pantalla ancha. Prepárate para");

    public static  Games[] juegosDeZombies ={
            z,z2,z3,z4,z5,z6,z7,z8,z9
    };

    //juegos de plataformas
    private static Games p = new Games("This War of Mine Complete Edition",R.drawable.this_war_of_mine_1294_poster_210x300,"En This War of Mine no jugarás como un soldado de élite, sino como un grupo de civiles que tratan de sobrevivir en una ciudad asediada por la guerra: no tendrás suficiente comida ni medicinas, y estarás bajo el peligro constante de francotiradores y otros civiles hostiles. El juego te hará vivir la guerra desde un ángulo completamente nuevo.");
    private static Games p2 = new Games("Bloodstained Ritual of the Night",R.drawable.bloodstained_ritual_of_the_night,"Bloodstained Ritual of the Night  es un RPG de acción de desplazamiento lateral centrado en la exploración, y contiene los elementos más populares del género Metroidvania en un solo juego repleto de contenido En él encarnas a Miriam, una huérfana trágicamente marcada por la maldición de un alquimista,");
    private static Games p3 = new Games("Cuphead Deluxe Edition",R.drawable.cuphead_deluxe_edition,"Cuphead es un juego de acción clásico estilo «dispara y corre» que se centra en combates contra el jefe. Inspirado en los dibujos animados de los años 30, los aspectos visual y sonoro están diseñados con esmero empleando las mismas técnicas de la época, es decir, animación tradicional a mano, fondos de acuarela y grabaciones originales de jazz.");
    private static Games p4 = new Games("Crash Bandicoot N. Sane Trilogy",R.drawable.crash_bandicoot_n_sane_trilogy,"¡Vuelve Crash Bandicoot™, tu marsupial favorito! Mejorado, embelesado y listo para bailar con la colección de juegos La trilogía. Ahora puedes disfrutar de Crash Bandicoot como nunca antes. Gira, salta, rompe, enfréntate a los épicos desafíos y vive las aventuras de los tres juegos con los que empezó todo: Crash Bandicoot™, Crash Bandicoot™ 2: Cortex Strikes Back y Crash Bandicoot™ 3:");
    private static Games p5 = new Games("Mega Man Legacy Collection Bundle",R.drawable.mega_man_legacy_collection_bundle,"Mega Man Legacy Collection Bundle es una celebración de la historia de 8 bits del icónico bombardero azul. La Legacy Collection presenta reproducciones muy fieles a los orígenes de la serie, con los seis juegos originales de Mega Man, esto despertará los recuerdos de los fans e introducirá a los recién llegados en lo que convirtió a Mega Man en un personaje tan popular. Mega Man Legacy");
    private static Games p6 = new Games("Castle of Illusion HD",R.drawable.castle_of_illusion_hd,"Mickey Mouse vuelve a Castle of Illusion, un clásico de SEGA Genesis. ¡Con gráficos en alta definición y una experiencia de juego totalmente renovada, Castle of Illusion te trae a Mickey y su mundo en esta mágica aventura de Disney! La");
    private static Games p7 = new Games("Dead Cells",R.drawable.dead_cells,"¿Creciste con los juegos de tipo roguelike, fuiste testigo de los juegos roguelite y hasta de los roguelite-lite? Pues te presentamos nuestro juego de estilo roguevania, el hijo ilegítimo de un roguelite moderno (Rogue Legacy, Binding of Isaac, Enter the Gungeon, Spelunky, etc.) y un metroidvania de la vieja escuela (Castlevania: SotN y similares).");
    private static Games p8 = new Games("Lara Croft and the Guardian of Light",R.drawable.lara_croft_and_the_guardian_of_light,"Lara Croft and the Guardian of Light es un juego de accción y aventura protagonizado por Lara Croft. Este nuevo capítulo de la saga de Tomb Raider combina los rasgos principales de la misma, tales como la exploración, las plataformas y la resolución de puzles, con la progresión del personaje, divertidos combates a un ritmo frenético y elementos de cooperación y competición entre amigos.");
    private static Games p9 = new Games("Sonic Generations",R.drawable.sonic_generations,"La celebración definitiva de los veinte años de videojuegos de Sonic, Sonic Generations, ofrece la experiencia de juego definitiva para los nuevos seguidores de Sonic y para los de siempre. El universo de Sonic se convierte en un caos cuando aparece un nuevo poder capaz de crear «agujeros temporales» que transportan a Sonic y a sus amigos al pasado. Allí, Sonic se encontrará con");

    public static Games[] juegosDePlataformas = {
            p,p2,p3,p4,p5,p6,p7,p8,p9
    };

    public static Games[] videojuegosFull = {
            games,
            games2,
            games3,
            games4,
            games4,
            games5,
            games6,
            games7,
            games8,
            games9,
            c1,
            c2,
            c3,
            c4,
            c5,
            c6,
            c7,
            c8,
            c9,
            l1,l2,l3,l4,l5,l6,l7,l8,l9,
            r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,
            z,z2,z3,z4,z5,z6,z7,z8,z9,
            p,p2,p3,p4,p5,p6,p7,p8,p9
    };

    public static List<VideoJuego> favoritos = new ArrayList<>();

}
