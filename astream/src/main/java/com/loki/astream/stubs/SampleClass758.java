package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass758 {

    @Ignore    private SampleClass759 sampleClass;

    public SampleClass758(){
        sampleClass = new SampleClass759();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}