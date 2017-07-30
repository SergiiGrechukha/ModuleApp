package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass84 {

    @Ignore    private SampleClass85 sampleClass;

    public SampleClass84(){
        sampleClass = new SampleClass85();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}