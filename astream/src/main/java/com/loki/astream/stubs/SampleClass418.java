package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass418 {

    @Ignore    private SampleClass419 sampleClass;

    public SampleClass418(){
        sampleClass = new SampleClass419();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}