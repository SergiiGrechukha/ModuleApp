package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass555 {

    @Ignore    private SampleClass556 sampleClass;

    public SampleClass555(){
        sampleClass = new SampleClass556();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}