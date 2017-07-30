package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1796 {

    @Ignore    private SampleClass1797 sampleClass;

    public SampleClass1796(){
        sampleClass = new SampleClass1797();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}