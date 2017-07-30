package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass499 {

    @Ignore    private SampleClass500 sampleClass;

    public SampleClass499(){
        sampleClass = new SampleClass500();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}