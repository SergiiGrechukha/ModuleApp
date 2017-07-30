package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass70 {

    @Ignore    private SampleClass71 sampleClass;

    public SampleClass70(){
        sampleClass = new SampleClass71();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}