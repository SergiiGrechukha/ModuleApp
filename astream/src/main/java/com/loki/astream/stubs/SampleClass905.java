package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass905 {

    @Ignore    private SampleClass906 sampleClass;

    public SampleClass905(){
        sampleClass = new SampleClass906();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}