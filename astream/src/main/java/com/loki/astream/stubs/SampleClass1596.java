package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1596 {

    @Ignore    private SampleClass1597 sampleClass;

    public SampleClass1596(){
        sampleClass = new SampleClass1597();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}