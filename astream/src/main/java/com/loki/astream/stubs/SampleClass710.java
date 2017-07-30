package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass710 {

    @Ignore    private SampleClass711 sampleClass;

    public SampleClass710(){
        sampleClass = new SampleClass711();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}