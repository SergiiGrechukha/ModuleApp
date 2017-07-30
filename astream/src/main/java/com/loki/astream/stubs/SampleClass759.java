package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass759 {

    @Ignore    private SampleClass760 sampleClass;

    public SampleClass759(){
        sampleClass = new SampleClass760();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}