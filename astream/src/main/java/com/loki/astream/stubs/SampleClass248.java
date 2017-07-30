package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass248 {

    @Ignore    private SampleClass249 sampleClass;

    public SampleClass248(){
        sampleClass = new SampleClass249();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}