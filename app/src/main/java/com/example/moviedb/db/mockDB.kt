package com.example.moviedb.db

import com.example.moviedb.models.Movie


class Movies {
    //https://api.themoviedb.org/3/movie/popular?language=en-US&page=1
    fun getPopularMovies(): List<Movie>{
        return listOf(
            Movie(
                id = 1523145,
                title = "Your Heart Will Be Broken",
                posterPath = "/7wIBfBl2gejt6xHxNSK0reVIm7E.jpg",
                backdropPath = "/1x9e0qWonw634NhIsRdvnneeqvN.jpg",
                releaseDate = "2026-03-26",
                overview = "High school student Polina is saved from bullying at her new school and makes a deal with the main bully Bars: he must pretend to be her boyfriend and protect her, and she must do everything he says. During this game, the couple develops real feelings, but her family and classmates have reasons to separate the lovers."
            ),
            Movie(
                id = 1226863,
                title = "The Super Mario Galaxy Movie",
                posterPath = "/eJGWx219ZcEMVQJhAgMiqo8tYY.jpg",
                backdropPath = "/9Z2uDYXqJrlmePznQQJhL6d92Rq.jpg",
                releaseDate = "2026-04-01",
                overview = "Having thwarted Bowser's previous plot to marry Princess Peach, Mario and Luigi now face a fresh threat in Bowser Jr., who is determined to liberate his father from captivity and restore the family legacy. Alongside companions new and old, the brothers travel across the stars to stop the young heir's crusade."
            ),
            Movie(
                id = 83533,
                title = "Avatar: Fire and Ash",
                posterPath = "/cf7hE1ifY4UNbS25tGnaTyyDrI2.jpg",
                backdropPath = "/u8DU5fkLoM5tTRukzPC31oGPxaQ.jpg",
                releaseDate = "2025-12-17",
                overview = "In the wake of the devastating war against the RDA and the loss of their eldest son, Jake Sully and Neytiri face a new threat on Pandora: the Ash People, a violent and power-hungry Na'vi tribe led by the ruthless Varang. Jake's family must fight for their survival and the future of Pandora in a conflict that pushes them to their emotional and physical limits."
            ),
            Movie(
                id = 502356,
                title = "The Super Mario Bros. Movie",
                posterPath = "/qNBAXBIQlnOThrVvA6mA2B5ggV6.jpg",
                backdropPath = "/9n2tJBplPbgR2ca05hS5CKXwP2c.jpg",
                releaseDate = "2023-04-05",
                overview = "While working underground to fix a water main, Brooklyn plumbers—and brothers—Mario and Luigi are transported down a mysterious pipe and wander into a magical new world. But when the brothers are separated, Mario embarks on an epic quest to find Luigi."
            ),
            Movie(
                id = 687163,
                title = "Project Hail Mary",
                posterPath = "/yihdXomYb5kTeSivtFndMy5iDmf.jpg",
                backdropPath = "/8Tfys3mDZVp4tNoH2ktm06a0Tau.jpg",
                releaseDate = "2026-03-15",
                overview = "Science teacher Ryland Grace wakes up on a spaceship light years from home with no recollection of who he is or how he got there. As his memory returns, he begins to uncover his mission: solve the riddle of the mysterious substance causing the sun to die out. He must call on his scientific knowledge and unorthodox ideas to save everything on Earth from extinction… but an unexpected friendship means he may not have to do it alone."
            ),
            Movie(
                id = 1327819,
                title = "Hoppers",
                posterPath = "/xjtWQ2CL1mpmMNwuU5HeS4Iuwuu.jpg",
                backdropPath = "/u53UYu5XG2hNgWGvs3xGhAVzypl.jpg",
                releaseDate = "2026-03-04",
                overview = "Scientists have discovered how to 'hop' human consciousness into lifelike robotic animals, allowing people to communicate with animals as animals. Animal lover Mabel seizes an opportunity to use the technology, uncovering mysteries within the animal world beyond anything she could have imagined."
            ),
            Movie(
                id = 1290417,
                title = "Thrash",
                posterPath = "/adk8weka3O5648g3de4z3y4aE7G.jpg",
                backdropPath = "/3ooXDVaz4xHKtwe4lkmF1gNopOC.jpg",
                releaseDate = "2026-04-10",
                overview = "When a Category 5 hurricane decimates a coastal town, the storm surge brings devastation, chaos, and something far more frightening onto shore: hungry sharks."
            ),
            Movie(
                id = 1641319,
                title = "Sniper: No Nation",
                posterPath = "/3T9nAX0jAp0iT18ex25BlZEpRDb.jpg",
                backdropPath = "/7lizs4SuEU2ihkkAa0SZ66NtHbl.jpg",
                releaseDate = "2026-04-07",
                overview = "Brandon Beckett and Agent Zero lead a rescue mission in Venezuela when their friends are taken hostage."
            ),
            Movie(
                id = 1290821,
                title = "Shelter",
                posterPath = "/buPFnHZ3xQy6vZEHxbHgL1Pc6CR.jpg",
                backdropPath = "/nHxWyy18SvAZ8jJeemtS8k1UNjM.jpg",
                releaseDate = "2026-01-28",
                overview = "A man living in self-imposed exile on a remote island rescues a young girl from a violent storm, setting off a chain of events that forces him out of seclusion to protect her from enemies tied to his past."
            ),
            Movie(
                id = 840464,
                title = "Greenland 2: Migration",
                posterPath = "/z2tqCJLsw6uEJ8nJV8BsQXGa3dr.jpg",
                backdropPath = "/wns4x1GyxCudgOZRyhXKjXVJf3T.jpg",
                releaseDate = "2026-01-07",
                overview = "Having found the safety of the Greenland bunker after the comet Clarke decimated the Earth, the Garrity family must now risk everything to embark on a perilous journey across the wasteland of Europe to find a new home."
            ),
            Movie(
                id = 1470130,
                title = "The Mortuary Assistant",
                posterPath = "/72AoFPC5TY4DfJwXXS9rPwPeReD.jpg",
                backdropPath = "/gM1kQRPwOVW1Eos5tVWqcYmHR5S.jpg",
                releaseDate = "2026-02-13",
                overview = "Rebecca Owens, a recent mortuary science graduate takes a night shift job at River Fields Mortuary. Initially, the job seems straightforward — embalming bodies, completing paperwork, and keeping things tidy. But once Rebecca starts working the night shift, things take a dark turn."
            ),
            Movie(
                id = 1171145,
                title = "Crime 101",
                posterPath = "/tVvpFIoteRHNnoZMhdnwIVwJpCA.jpg",
                backdropPath = "/vG42HeYtoTFflqwP42wYD7tBuNr.jpg",
                releaseDate = "2026-02-11",
                overview = "When an elusive thief whose high-stakes heists unfold along the iconic 101 freeway in Los Angeles eyes the score of a lifetime, with hopes of this being his final job, his path collides with a disillusioned insurance broker who is facing her own crossroads. Determined to crack the case, a relentless detective closes in on the operation, raising the stakes even higher."
            ),
            Movie(
                id = 1297842,
                title = "GOAT",
                posterPath = "/wfuqMlaExcoYiUEvKfVpUTt1v4u.jpg",
                backdropPath = "/tq3h43fZy0H80vzf47MAY7R9Mxo.jpg",
                releaseDate = "2026-02-11",
                overview = "A small goat with big dreams gets a once-in-a-lifetime shot to join the pros and play roarball, a high-intensity, co-ed, full-contact sport dominated by the fastest, fiercest animals in the world."
            ),
            Movie(
                id = 1049471,
                title = "Outcome",
                posterPath = "/kSzcpfbTy2pXHGvrVU2WhQTo6oU.jpg",
                backdropPath = "/avwIERZtWiWa34qShf5biDzAVaF.jpg",
                releaseDate = "2026-04-06",
                overview = "Reef Hawk, Hollywood's poster child since age six, is not okay. When he learns about an extortion plot tied to a mysterious video, Reef preemptively sets out on a redemption tour to make amends, confront his demons, and avoid getting canceled."
            ),
            Movie(
                id = 1159559,
                title = "Scream 7",
                posterPath = "/jjyuk0edLiW8vOSnlfwWCCLpbh5.jpg",
                backdropPath = "/hz7TdCrpLLt2Dz7S3PS2HG9rpAO.jpg",
                releaseDate = "2026-02-25",
                overview = "When a new Ghostface killer emerges in the quiet town where Sidney Prescott has built a new life, her darkest fears are realized as her daughter becomes the next target. Determined to protect her family, Sidney must face the horrors of her past to put an end to the bloodshed once and for all."
            ),
            Movie(
                id = 1265609,
                title = "War Machine",
                posterPath = "/tlPgDzwIE7VYYIIAGCTUOnN4wI1.jpg",
                backdropPath = "/6yeVcxFR0j08vlv2OlL6zbewm4D.jpg",
                releaseDate = "2026-02-12",
                overview = "On one last grueling mission during Army Ranger training, a combat engineer must lead his unit in a fight against a giant otherworldly killing machine."
            ),
            Movie(
                id = 1311031,
                title = "Demon Slayer: Kimetsu no Yaiba Infinity Castle",
                posterPath = "/fWVSwgjpT2D78VUh6X8UBd2rorW.jpg",
                backdropPath = "/1RgPyOhN4DRs225BGTlHJqCudII.jpg",
                releaseDate = "2025-07-18",
                overview = "The Demon Slayer Corps are drawn into the Infinity Castle, where Tanjiro, Nezuko, and the Hashira face terrifying Upper Rank demons in a desperate fight as the final battle against Muzan Kibutsuji begins."
            ),
            Movie(
                id = 1159831,
                title = "The Bride!",
                posterPath = "/lV8YHwGkYZsm6EfIqnhaSz2avKt.jpg",
                backdropPath = "/l8rKKMU2M9dDULO9CEtDNdWAEUJ.jpg",
                releaseDate = "2026-03-04",
                overview = "A lonely Frankenstein travels to 1930s Chicago to ask groundbreaking scientist Dr. Euphronious to create a companion for him. The two revive a murdered young woman and The Bride is born. But what ensues is beyond what either of them imagined."
            ),
            Movie(
                id = 1526650,
                title = "Mudborn",
                posterPath = "/ifYNeKwpyKUTtjkUExrqTc65L2p.jpg",
                backdropPath = "/3okjpK0zn4LGkXXdfPS7WKzcyve.jpg",
                releaseDate = "2025-10-09",
                overview = "Hsu-Chuan, who works at a game company, accidentally brings home a broken clay doll from a haunted house while developing a new horror VR game. Unexpectedly, his pregnant wife, Mu-Hua, a cultural relic restorer, develops an obsession with the doll and relentlessly tries to repair it. As strange things begin to happen in the house, Mu-Hua's condition deteriorates, and Hsu-Chuan, at his wits' end, seeks help from a spiritual medium, Ah-Sheng. Meanwhile, the horrifying secret hidden behind the clay doll begins to surface."
            ),
            Movie(
                id = 1084577,
                title = "Balls Up",
                posterPath = "/xwvJ3WzdJ1OCuDoY8LAxBUlQyig.jpg",
                backdropPath = "/jRsjWwZzI39bTm44FNhRtiICd9k.jpg",
                releaseDate = "2026-04-15",
                overview = "Two marketing executives go \"balls out\" and pitch a bold full‑coverage condom sponsorship with the World Cup. After their drunken celebration in Brazil sparks a global scandal, they must outrun furious fans, criminals, and power-hungry officials to salvage their careers and make it home alive."
            )
        )
    }

    // https://api.themoviedb.org/3/movie/top_rated?language=en-US&page=1
    fun getTopRatedMovies(): List<Movie> {
        return listOf(
            Movie(
                id = 278,
                title = "The Shawshank Redemption",
                posterPath = "/9cqNxx0GxF0bflZmeSMuL5tnGzr.jpg",
                backdropPath = "/zfbjgQE1uSd9wiPTX4VzsLi0rGG.jpg",
                releaseDate = "1994-09-23",
                overview = "Imprisoned in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.",
                genres = listOf("Drama", "Crime"),
                imdbId = "tt0111161"
            ),
            Movie(
                id = 238,
                title = "The Godfather",
                posterPath = "/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
                backdropPath = "/tSPT36ZKlP2WVHJLM4cQPLSzv3b.jpg",
                releaseDate = "1972-03-14",
                overview = "Spanning the years 1945 to 1955, a chronicle of the fictional Italian-American Corleone crime family. When organized crime family patriarch, Vito Corleone barely survives an attempt on his life, his youngest son, Michael steps in to take care of the would-be killers, launching a campaign of bloody revenge."
            ),
            Movie(
                id = 240,
                title = "The Godfather Part II",
                posterPath = "/hek3koDUyRQk7FIhPXsa6mT2Zc3.jpg",
                backdropPath = "/kGzFbGhp99zva6oZODW5atUtnqi.jpg",
                releaseDate = "1974-12-20",
                overview = "In the continuing saga of the Corleone crime family, a young Vito Corleone grows up in Sicily and in 1910s New York. In the 1950s, Michael Corleone attempts to expand the family business into Las Vegas, Hollywood and Cuba."
            ),
            Movie(
                id = 424,
                title = "Schindler's List",
                posterPath = "/sF1U4EUQS8YHUYjNl3pMGNIQyr0.jpg",
                backdropPath = "/zb6fM1CX41D9rF9hdgclu0peUmy.jpg",
                releaseDate = "1993-12-15",
                overview = "The true story of how businessman Oskar Schindler saved over a thousand Jewish lives from the Nazis while they worked as slaves in his factory during World War II."
            ),
            Movie(
                id = 389,
                title = "12 Angry Men",
                posterPath = "/zhG3vKWyDRaZYoaww1UVAi29T9h.jpg",
                backdropPath = "/w4bTBXcqXc2TUyS5Fc4h67uWbPn.jpg",
                releaseDate = "1957-04-10",
                overview = "The defense and the prosecution have rested and the jury is filing into the jury room to decide if a young Spanish-American is guilty or innocent of murdering his father. What begins as an open and shut case soon becomes a mini-drama of each of the jurors' prejudices and preconceptions about the trial, the accused, and each other."
            ),
            Movie(
                id = 129,
                title = "Spirited Away",
                posterPath = "/39wmItIWsg5sZMyRUHLkWBcuVCM.jpg",
                backdropPath = "/dyJvKsNs2KP8qQnAXbRwDjblViy.jpg",
                releaseDate = "2001-07-20",
                overview = "A young girl, Chihiro, becomes trapped in a strange new world of spirits. When her parents undergo a mysterious transformation, she must call upon the courage she never knew she had to free her family."
            ),
            Movie(
                id = 155,
                title = "The Dark Knight",
                posterPath = "/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
                backdropPath = "/cfT29Im5VDvjE0RpyKOSdCKZal7.jpg",
                releaseDate = "2008-07-16",
                overview = "Batman raises the stakes in his war on crime. With the help of Lt. Jim Gordon and District Attorney Harvey Dent, Batman sets out to dismantle the remaining criminal organizations that plague the streets. The partnership proves to be effective, but they soon find themselves prey to a reign of chaos unleashed by a rising criminal mastermind known to the terrified citizens of Gotham as the Joker."
            ),
            Movie(
                id = 1181678,
                title = "¿Quieres ser mi hijo?",
                posterPath = "/9GuvODahvuFqdhuZ16aBLR4UJoP.jpg",
                backdropPath = "/xyWKrni8WrYzqn7ztvI5nIY0h62.jpg",
                releaseDate = "2023-09-21",
                overview = "Lu, a conformist woman in her forties, learns that her 15-year partner has been having extramarital affairs. Starting from scratch, she gets involved in an unexpected relationship with a young womanizer."
            ),
            Movie(
                id = 19404,
                title = "Dilwale Dulhania Le Jayenge",
                posterPath = "/2CAL2433ZeIihfX1Hb2139CX0pW.jpg",
                backdropPath = "/6N5d02quKqMKqvTpOdFmBDy9scY.jpg",
                releaseDate = "1995-10-20",
                overview = "Raj is a rich, carefree, happy-go-lucky second generation NRI. Simran is the daughter of Chaudhary Baldev Singh, who in spite of being an NRI is very strict about adherence to Indian values. Simran has left for India to be married to her childhood fiancé. Raj leaves for India with a mission at his hands, to claim his lady love under the noses of her whole family. Thus begins a saga."
            ),
            Movie(
                id = 497,
                title = "The Green Mile",
                posterPath = "/8VG8fDNiy50H4FedGwdSVUPoaJe.jpg",
                backdropPath = "/b6HWTOxn1xevvyHU2K9ICvaRU6g.jpg",
                releaseDate = "1999-12-10",
                overview = "A supernatural tale set on death row in a Southern prison, where gentle giant John Coffey possesses the mysterious power to heal people's ailments. When the cell block's head guard, Paul Edgecomb, recognizes Coffey's miraculous gift, he tries desperately to help stave off the condemned man's execution."
            ),
            Movie(
                id = 122,
                title = "The Lord of the Rings: The Return of the King",
                posterPath = "/rCzpDGLbOoPwLjy3OAm5NUPOTrC.jpg",
                backdropPath = "/2u7zbn8EudG6kLlBzUYqP8RyFU4.jpg",
                releaseDate = "2003-12-17",
                overview = "As armies mass for a final battle that will decide the fate of the world--and powerful, ancient forces of Light and Dark compete to determine the outcome--one member of the Fellowship of the Ring is revealed as the noble heir to the throne of the Kings of Men. Yet, the sole hope for triumph over evil lies with a brave hobbit, Frodo, who, accompanied by his loyal friend Sam and the hideous, wretched Gollum, ventures deep into the very dark heart of Mordor on his seemingly impossible quest to destroy the Ring of Power.​"
            ),
            Movie(
                id = 496243,
                title = "Parasite",
                posterPath = "/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
                backdropPath = "/hiKmpZMGZsrkA3cdce8a7Dpos1j.jpg",
                releaseDate = "2019-05-30",
                overview = "All unemployed, Ki-taek's family takes peculiar interest in the wealthy and glamorous Parks for their livelihood until they get entangled in an unexpected incident."
            ),
            Movie(
                id = 680,
                title = "Pulp Fiction",
                posterPath = "/vQWk5YBFWF4bZaofAbv0tShwBvQ.jpg",
                backdropPath = "/suaEOtk1N1sgg2MTM7oZd2cfVp3.jpg",
                releaseDate = "1994-09-10",
                overview = "A burger-loving hit man, his philosophical partner, a drug-addled gangster's moll and a washed-up boxer converge in this sprawling, comedic crime caper. Their adventures unfurl in three stories that ingeniously trip back and forth in time."
            ),
            Movie(
                id = 372058,
                title = "Your Name.",
                posterPath = "/q719jXXEzOoYaps6babgKnONONX.jpg",
                backdropPath = "/8x9iKH8kWA0zdkgNdpAew7OstYe.jpg",
                releaseDate = "2016-08-26",
                overview = "High schoolers Mitsuha and Taki are complete strangers living separate lives. But one night, they suddenly switch places. Mitsuha wakes up in Taki’s body, and he in hers. This bizarre occurrence continues to happen randomly, and the two must adjust their lives around each other."
            ),
            Movie(
                id = 157336,
                title = "Interstellar",
                posterPath = "/yQvGrMoipbRoddT0ZR8tPoR7NfX.jpg",
                backdropPath = "/2ssWTSVklAEc98frZUQhgtGHx7s.jpg",
                releaseDate = "2014-11-05",
                overview = "The adventures of a group of explorers who make use of a newly discovered wormhole to surpass the limitations on human space travel and conquer the vast distances involved in an interstellar voyage."
            ),
            Movie(
                id = 429,
                title = "The Good, the Bad and the Ugly",
                posterPath = "/bX2xnavhMYjWDoZp1VM6VnU1xwe.jpg",
                backdropPath = "/Adrip2Jqzw56KeuV2nAxucKMNXA.jpg",
                releaseDate = "1966-12-23",
                overview = "While the Civil War rages on between the Union and the Confederacy, three men – a quiet loner, a ruthless hitman, and a Mexican bandit – comb the American Southwest in search of a strongbox containing $200,000 in stolen gold."
            ),
            Movie(
                id = 13,
                title = "Forrest Gump",
                posterPath = "/saHP97rTPS5eLmrLQEcANmKrsFl.jpg",
                backdropPath = "/67HggiWaP9ZLv5sPYmyRV37yAJM.jpg",
                releaseDate = "1994-06-23",
                overview = "A man with a low IQ has accomplished great things in his life and been present during significant historic events—in each case, far exceeding what anyone imagined he could do. But despite all he has achieved, his one true love eludes him."
            ),
            Movie(
                id = 769,
                title = "GoodFellas",
                posterPath = "/9OkCLM73MIU2CrKZbqiT8Ln1wY2.jpg",
                backdropPath = "/gILte6Zd7m1YneIr6MVhh30S9pr.jpg",
                releaseDate = "1990-09-12",
                overview = "The true story of Henry Hill, a half-Irish, half-Sicilian Brooklyn kid who is adopted by neighbourhood gangsters at an early age and climbs the ranks of a Mafia family under the guidance of Jimmy Conway."
            ),
            Movie(
                id = 346,
                title = "Seven Samurai",
                posterPath = "/lOMGc8bnSwQhS4XyE1S99uH8NXf.jpg",
                backdropPath = "/qvZ91FwMq6O47VViAr8vZNQz3WI.jpg",
                releaseDate = "1954-04-26",
                overview = "A samurai answers a village's request for protection after he falls on hard times. The town needs protection from bandits, so the samurai gathers six others to help him teach the people how to defend themselves, and the villagers provide the soldiers with food."
            ),
            Movie(
                id = 12477,
                title = "Grave of the Fireflies",
                posterPath = "/k9tv1rXZbOhH7eiCk378x61kNQ1.jpg",
                backdropPath = "/aHaqZpOL7UyVu0nKqp3SMz0o2E1.jpg",
                releaseDate = "1988-04-16",
                overview = "In the final months of World War II, 14-year-old Seita and his sister Setsuko are orphaned when their mother is killed during an air raid in Kobe, Japan. After a falling out with their aunt, they move into an abandoned bomb shelter. With no surviving relatives and their emergency rations depleted, Seita and Setsuko struggle to survive."
            )
        )
    }
}