package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass793 {

    @Ignore    private SampleClass794 sampleClass;

    public SampleClass793(){
        sampleClass = new SampleClass794();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}