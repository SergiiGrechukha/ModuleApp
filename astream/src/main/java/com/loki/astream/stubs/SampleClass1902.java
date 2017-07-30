package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1902 {

    @Ignore    private SampleClass1903 sampleClass;

    public SampleClass1902(){
        sampleClass = new SampleClass1903();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}