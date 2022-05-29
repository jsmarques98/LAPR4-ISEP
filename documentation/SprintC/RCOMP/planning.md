RCOMP 2021-2022 Project - Sprint 3 planning
===========================================
### Sprint master: 1200972 (José Rocha) ###

# 1. Sprint's backlog #

In this sprint the team is required to elaborate some tasks:
1. OSPF dynamic routing
2. HTTP servers
3. DHCPv4 service
4. VoIP service
5. DNS
6. NAT (Network Address Translation)
7. Static Firewall (ACLs)

All these tasks must be accomplished usint the previous sprint's packet tracker file for the campus.

Each team-member will deliver that file with all the configurations reagarding their building.

# 2. Technical decisions and coordination #

We will name our ospf 'ospf 1' and the areas will be distributed by buildings so:
- BachBone:   area 0
- Building 1: area 1
- Building 2: area 2
- Building 3: area 3


The prefixes for the phones will follow the same pattern:
- Building 1: 1... (1000, 1001)
- Building 2: 2... (2000, 2001)
- Building 3: 3... (3000, 3001)

DNS domain for all the buildings:
- Building 1: rcomp-21-22-di-g1 / ns.rcomp-21-22-di-g1
- Building 2: building-2.rcomp-21-22-di-g1 / ns.building-2.rcomp-21-22-di-g1
- Building 3: building-3.rcomp-21-22-di-g1 / ns.building-3.rcomp-21-22-di-g1


# 3. Subtasks assignment #

* 1200972 - (T.3.1) Update the campus.pkt layer three Packet Tracer simulation from the previous sprint, to include the described features in this sprint for building 1.

* 1200871 - (T.3.2) Update the campus.pkt layer three Packet Tracer simulation from the previous sprint, to include the described features in this sprint for building 2.

* 1201008 - (T.3.3) Update the campus.pkt layer three Packet Tracer simulation from the previous sprint, to include the described features in this sprint for building 3.


