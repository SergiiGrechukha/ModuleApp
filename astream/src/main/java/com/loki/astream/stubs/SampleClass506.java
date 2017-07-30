package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass506 {

    @Ignore    private SampleClass507 sampleClass;

    public SampleClass506(){
        sampleClass = new SampleClass507();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}