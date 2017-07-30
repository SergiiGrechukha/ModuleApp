package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1850 {

    @Ignore    private SampleClass1851 sampleClass;

    public SampleClass1850(){
        sampleClass = new SampleClass1851();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}