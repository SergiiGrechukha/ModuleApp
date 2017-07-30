package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass255 {

    @Ignore    private SampleClass256 sampleClass;

    public SampleClass255(){
        sampleClass = new SampleClass256();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}