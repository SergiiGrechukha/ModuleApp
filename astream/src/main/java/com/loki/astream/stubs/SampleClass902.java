package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass902 {

    @Ignore    private SampleClass903 sampleClass;

    public SampleClass902(){
        sampleClass = new SampleClass903();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}