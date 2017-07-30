package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1766 {

    @Ignore    private SampleClass1767 sampleClass;

    public SampleClass1766(){
        sampleClass = new SampleClass1767();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}