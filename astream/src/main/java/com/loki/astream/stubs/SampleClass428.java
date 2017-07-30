package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass428 {

    @Ignore    private SampleClass429 sampleClass;

    public SampleClass428(){
        sampleClass = new SampleClass429();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}