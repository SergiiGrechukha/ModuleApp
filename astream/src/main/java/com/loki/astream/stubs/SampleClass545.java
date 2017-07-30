package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass545 {

    @Ignore    private SampleClass546 sampleClass;

    public SampleClass545(){
        sampleClass = new SampleClass546();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}