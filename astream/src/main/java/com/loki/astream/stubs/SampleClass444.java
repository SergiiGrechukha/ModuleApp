package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass444 {

    @Ignore    private SampleClass445 sampleClass;

    public SampleClass444(){
        sampleClass = new SampleClass445();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}