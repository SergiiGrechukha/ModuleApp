package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1924 {

    @Ignore    private SampleClass1925 sampleClass;

    public SampleClass1924(){
        sampleClass = new SampleClass1925();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}