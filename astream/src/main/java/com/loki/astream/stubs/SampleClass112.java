package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass112 {

    @Ignore    private SampleClass113 sampleClass;

    public SampleClass112(){
        sampleClass = new SampleClass113();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}