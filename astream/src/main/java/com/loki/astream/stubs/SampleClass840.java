package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass840 {

    @Ignore    private SampleClass841 sampleClass;

    public SampleClass840(){
        sampleClass = new SampleClass841();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}