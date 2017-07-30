package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass748 {

    @Ignore    private SampleClass749 sampleClass;

    public SampleClass748(){
        sampleClass = new SampleClass749();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}