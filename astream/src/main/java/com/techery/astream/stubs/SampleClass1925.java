package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1925 {

    @Ignore    private SampleClass1926 sampleClass;

    public SampleClass1925(){
        sampleClass = new SampleClass1926();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}