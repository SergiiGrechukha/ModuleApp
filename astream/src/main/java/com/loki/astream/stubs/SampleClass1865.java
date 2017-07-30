package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1865 {

    @Ignore    private SampleClass1866 sampleClass;

    public SampleClass1865(){
        sampleClass = new SampleClass1866();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}