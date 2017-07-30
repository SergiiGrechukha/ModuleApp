package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass846 {

    @Ignore    private SampleClass847 sampleClass;

    public SampleClass846(){
        sampleClass = new SampleClass847();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}