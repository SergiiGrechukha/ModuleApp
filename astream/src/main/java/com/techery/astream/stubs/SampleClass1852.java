package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1852 {

    @Ignore    private SampleClass1853 sampleClass;

    public SampleClass1852(){
        sampleClass = new SampleClass1853();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}