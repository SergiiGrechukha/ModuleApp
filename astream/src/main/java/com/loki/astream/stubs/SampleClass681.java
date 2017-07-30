package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass681 {

    @Ignore    private SampleClass682 sampleClass;

    public SampleClass681(){
        sampleClass = new SampleClass682();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}