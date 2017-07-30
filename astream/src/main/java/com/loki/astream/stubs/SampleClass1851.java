package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1851 {

    @Ignore    private SampleClass1852 sampleClass;

    public SampleClass1851(){
        sampleClass = new SampleClass1852();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}