package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass970 {

    @Ignore    private SampleClass971 sampleClass;

    public SampleClass970(){
        sampleClass = new SampleClass971();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}