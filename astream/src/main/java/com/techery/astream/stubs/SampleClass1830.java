package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1830 {

    @Ignore    private SampleClass1831 sampleClass;

    public SampleClass1830(){
        sampleClass = new SampleClass1831();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}