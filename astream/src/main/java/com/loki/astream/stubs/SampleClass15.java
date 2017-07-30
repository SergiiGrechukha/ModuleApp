package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass15 {

    @Ignore    private SampleClass16 sampleClass;

    public SampleClass15(){
        sampleClass = new SampleClass16();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}