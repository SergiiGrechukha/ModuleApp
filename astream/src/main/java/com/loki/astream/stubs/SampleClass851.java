package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass851 {

    @Ignore    private SampleClass852 sampleClass;

    public SampleClass851(){
        sampleClass = new SampleClass852();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}