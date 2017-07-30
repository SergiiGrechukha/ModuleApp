package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1869 {

    @Ignore    private SampleClass1870 sampleClass;

    public SampleClass1869(){
        sampleClass = new SampleClass1870();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}