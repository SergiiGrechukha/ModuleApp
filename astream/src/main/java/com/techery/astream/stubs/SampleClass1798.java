package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1798 {

    @Ignore    private SampleClass1799 sampleClass;

    public SampleClass1798(){
        sampleClass = new SampleClass1799();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}