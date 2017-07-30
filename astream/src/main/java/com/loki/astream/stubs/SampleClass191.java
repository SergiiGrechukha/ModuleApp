package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass191 {

    @Ignore    private SampleClass192 sampleClass;

    public SampleClass191(){
        sampleClass = new SampleClass192();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}