package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1892 {

    @Ignore    private SampleClass1893 sampleClass;

    public SampleClass1892(){
        sampleClass = new SampleClass1893();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}