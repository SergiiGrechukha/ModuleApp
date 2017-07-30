package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass284 {

    @Ignore    private SampleClass285 sampleClass;

    public SampleClass284(){
        sampleClass = new SampleClass285();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}