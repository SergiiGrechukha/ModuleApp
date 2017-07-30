package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1512 {

    @Ignore    private SampleClass1513 sampleClass;

    public SampleClass1512(){
        sampleClass = new SampleClass1513();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}