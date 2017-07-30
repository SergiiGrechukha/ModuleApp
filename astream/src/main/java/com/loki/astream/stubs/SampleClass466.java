package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass466 {

    @Ignore    private SampleClass467 sampleClass;

    public SampleClass466(){
        sampleClass = new SampleClass467();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}